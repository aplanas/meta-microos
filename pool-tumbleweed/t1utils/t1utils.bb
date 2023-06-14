SUMMARY = "A collection of simple type-1 font manipulation programs"
DESCRIPTION = "The t1utils are a collection of simple type-1 font manipulation programs. \
Together, they allow you to convert between PFA (ASCII) and PFB \
(binary) formats, disassemble PFA or PFB files into human-readable \
form, and reassemble them into PFA or PFB format. Additionally, you can \
extract font resources from a Macintosh font file (ATM/Laserwriter) or \
create a Macintosh Type 1 font file from a PFA or PFB font."
LICENSE = "ISC"

PV = "1.42"

RPM_NAME = "t1utils-1.42-1.8.aarch64.rpm"
RPM_HASH = "1e73da3075f4adc08cc6eb7c2b57038395e3ba33976c4dc27a6c5d388dbd824728dc63e0e34e9f15f25a9b76ed586a0770070b21e2592a00792c3288c9098b23"

RPROVIDES:${PN} += "t1utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
