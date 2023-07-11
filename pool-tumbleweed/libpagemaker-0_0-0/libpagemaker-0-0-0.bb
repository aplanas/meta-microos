SUMMARY = "A library to import Adobe PageMaker documents"
DESCRIPTION = "libpagemaker is library providing ability to interpret and import \
Adobe PageMaker documents into various applications."
LICENSE = "MPL-2.0"

PV = "0.0.4"

RPM_NAME = "libpagemaker-0_0-0-0.0.4-1.30.aarch64.rpm"
RPM_HASH = "4c4e7d39fae6684f104fa66679f7fb542f824276ed9498f23f7a73ca34d11031b2405f2cf146af070746c9e57ba608792321029a09246be5ec04ae9374d6d0b5"

RPROVIDES:${PN} += "libpagemaker-0-0-0 \
libpagemaker-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6"

inherit rpm
