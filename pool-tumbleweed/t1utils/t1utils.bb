SUMMARY = "A collection of simple type-1 font manipulation programs"
DESCRIPTION = "The t1utils are a collection of simple type-1 font manipulation programs. \
Together, they allow you to convert between PFA (ASCII) and PFB \
(binary) formats, disassemble PFA or PFB files into human-readable \
form, and reassemble them into PFA or PFB format. Additionally, you can \
extract font resources from a Macintosh font file (ATM/Laserwriter) or \
create a Macintosh Type 1 font file from a PFA or PFB font."
LICENSE = "ISC"

PV = "1.42"

RPM_NAME = "t1utils-1.42-1.9.aarch64.rpm"
RPM_HASH = "3549e798c5b195c98e82734cfa6dffeb76fdf5dafec86a23a29ec80bb42139dba236f0814e6285aae1eabc3611cfe04d730918d2d98646dfd6ddfddc9ac83d36"

RPROVIDES:${PN} += "t1utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
