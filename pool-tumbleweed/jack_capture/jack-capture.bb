SUMMARY = "A small program to jack"
DESCRIPTION = "jack_capture is a small program to capture whatever \
sound is going out to your speakers into a file."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.73"

RPM_NAME = "jack_capture-0.9.73-1.12.aarch64.rpm"
RPM_HASH = "eaa8ccbec1ecfe4ed26c4bb1b1ae1f47d4ec6284470b931c184a55ed058f69a28301bc8c857de09b6157dd11c3149f0dd3935d781c54a2a07424f9e98152ffb1"

RPROVIDES:${PN} += "jack-capture"

RDEPENDS:${PN} += "libc.so.6 \
libjack.so.0 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
