SUMMARY = "Text converters to and from DOS/MAC to UNIX"
DESCRIPTION = "Dos2unix is used to convert plain text from DOS (CR/LF) format. Mac2unix \
converts plain text from MAC (CR) format to UNIX format (LF). \
 \
Unix2dos converts plain text files from UNIX \
format to DOS format and unix2dos converts from UNIX to MAC format."
LICENSE = "BSD-2-Clause"

PV = "7.4.4"

RPM_NAME = "dos2unix-7.4.4-1.3.aarch64.rpm"
RPM_HASH = "9a5e9c40b568549639d15352b74c26dd115609c20461aac716366a354db891fb74f31ebdb01c5bbd639089299660825125c6986989a91b2725387ddac6c33584"

RPROVIDES:${PN} += "dos2unix dos2unix(aarch-64) unix2dos"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
