SUMMARY = "Package provides recommended R-foreign"
DESCRIPTION = "This packages provides R-foreign, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.8.84"

RPM_NAME = "R-foreign-0.8.84-45.2.aarch64.rpm"
RPM_HASH = "eca8523e3a9819f5c9f1991bb32a1249d4ab59825ddac7aac3bef18b3658ca83d5599c512dfcbf79ad135f84134f31b2cb0d4aebee839ff8db93bbe09d105a30"

RPROVIDES:${PN} += "R-foreign"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
