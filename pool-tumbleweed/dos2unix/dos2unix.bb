SUMMARY = "Text converters to and from DOS/MAC to UNIX"
DESCRIPTION = "Dos2unix is used to convert plain text from DOS (CR/LF) format. Mac2unix \
converts plain text from MAC (CR) format to UNIX format (LF). \
 \
Unix2dos converts plain text files from UNIX \
format to DOS format and unix2dos converts from UNIX to MAC format."
LICENSE = "BSD-2-Clause"

PV = "7.5.0"

RPM_NAME = "dos2unix-7.5.0-1.1.aarch64.rpm"
RPM_HASH = "b7fd3c4773e8542d9953c2019b11105f9336f27f9824691bc186155041bc7bef160890c7c7ae2008d9875f305aef6f5a96d71a9388da69d961aff8a7206cdd41"

RPROVIDES:${PN} += "dos2unix \
dos2unix(aarch-64) \
unix2dos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
