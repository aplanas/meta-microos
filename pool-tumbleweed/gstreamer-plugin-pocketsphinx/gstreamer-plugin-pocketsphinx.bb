SUMMARY = "GStreamer Plugin for pocketsphinx"
DESCRIPTION = "Pocketsphinx is a version of the open-source CMU Sphinx II speech \
recognition system which is able to recognize speech in real-time. \
 \
This package provides the GStreamer plugin for pocketsphinx."
LICENSE = "BSD-2-Clause"

PV = "5~git20200227.e40da77"

RPM_NAME = "gstreamer-plugin-pocketsphinx-5~git20200227.e40da77-2.3.aarch64.rpm"
RPM_HASH = "83ef7757ab7a88fd3fc07d1e7a5ee28bb773fa1463985e24df89bbdf90dfd4afb5006508dd637273cf6562eaf80952c446cbc9d82f77b80239369135723066cc"

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
