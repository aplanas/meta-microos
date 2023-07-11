SUMMARY = "SDR DSP primitives"
DESCRIPTION = "A library with SDR DSP primitives"
LICENSE = "GPL-2.0-only"

PV = "0.4.0"

RPM_NAME = "libosmodsp0-0.4.0-1.19.aarch64.rpm"
RPM_HASH = "c331b17804aeea749e7e9b4f0769bf9b533ecdc4b8e492c14b5548047da266fc7063d41f51abe9e773235884656ed94a784a78bf131ec74b5fdc01dc416eb733"

RPROVIDES:${PN} += "libosmodsp.so.0 \
libosmodsp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3"

inherit rpm
