SUMMARY = "GStreamer Plugin for pocketsphinx"
DESCRIPTION = "Pocketsphinx is a version of the open-source CMU Sphinx II speech \
recognition system which is able to recognize speech in real-time. \
 \
This package provides the GStreamer plugin for pocketsphinx."
LICENSE = "BSD-2-Clause"

PV = "5~git20200227.e40da77"

RPM_NAME = "gstreamer-plugin-pocketsphinx-5~git20200227.e40da77-2.4.aarch64.rpm"
RPM_HASH = "fcd1971537317dd6a3f46d8be9f221a6c1270e04261822a2291ed4bbe99b8f8891d1021c7a0937e9c78dd7c0a55a355591330593a8b6bd0cacd82dee08df8c09"

RPROVIDES:${PN} += "gstreamer-plugin-pocketsphinx \
gstreamer1 \
libgstpocketsphinx.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpocketsphinx.so.3 \
libsphinxbase.so.3 \
pocketsphinx5"

inherit rpm
