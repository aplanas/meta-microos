SUMMARY = "Text converters to and from DOS/MAC to UNIX"
DESCRIPTION = "Dos2unix is used to convert plain text from DOS (CR/LF) format. Mac2unix \
converts plain text from MAC (CR) format to UNIX format (LF). \
 \
Unix2dos converts plain text files from UNIX \
format to DOS format and unix2dos converts from UNIX to MAC format."
LICENSE = "BSD-2-Clause"

PV = "7.5.1"

RPM_NAME = "dos2unix-7.5.1-1.1.aarch64.rpm"
RPM_HASH = "6d17614d448273ff395c82f5b13445c10b07f90a3beb099cc6ae617088c175fde4e5bf5be1cea624c3d69f2b612cb84a875fe84841d61fec764a644ab4f4e125"

RPROVIDES:${PN} += "dos2unix \
unix2dos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
