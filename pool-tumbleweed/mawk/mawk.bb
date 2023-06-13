SUMMARY = "Implementation of New/POSIX AWK"
DESCRIPTION = "mawk is an interpreter for the AWK Programming Language. It implements the AWK \
language as defined in Aho, Kernighan and Weinberger, The AWK  Programming \
Language, Addison-Wesley Publishing, 1988. Furthermore, it conforms to the \
POSIX 1003.2 (draft 11.3) definition of the AWK language and additionally \
provides a small number of extensions."
LICENSE = "GPL-2.0-only"

PV = "1.3.4.20200120"

RPM_NAME = "mawk-1.3.4.20200120-5.3.aarch64.rpm"
RPM_HASH = "891f263a7ad98975df99aec7acb6c6803a9d7efe04cc8ed799c114ede769145654f1f593e3abb8b6c1c4c5fad792566236f777476372322085ae6e4d74b2e60a"

RPROVIDES:${PN} += "mawk \
mawk(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
