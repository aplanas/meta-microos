SUMMARY = "A small program to jack"
DESCRIPTION = "jack_capture is a small program to capture whatever \
sound is going out to your speakers into a file."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.73"

RPM_NAME = "jack_capture-0.9.73-2.1.aarch64.rpm"
RPM_HASH = "0ae93e31980ee5e72a49f87a0be9888721ef037803081c40ebcb9d3c0df05d35972f5e3fe68f2a9ff85b3badc7ec87639755b5ecb03cbf22b7c94949a0802b5b"

RPROVIDES:${PN} += "jack-capture"

RDEPENDS:${PN} += "libc.so.6 \
libjack.so.0 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
