SUMMARY = "Implementation of New/POSIX AWK"
DESCRIPTION = "mawk is an interpreter for the AWK Programming Language. It implements the AWK \
language as defined in Aho, Kernighan and Weinberger, The AWK  Programming \
Language, Addison-Wesley Publishing, 1988. Furthermore, it conforms to the \
POSIX 1003.2 (draft 11.3) definition of the AWK language and additionally \
provides a small number of extensions."
LICENSE = "GPL-2.0-only"

PV = "1.3.4.20230525"

RPM_NAME = "mawk-1.3.4.20230525-1.1.aarch64.rpm"
RPM_HASH = "2125237a5dc816facbea9e5a522fb3ddb0e520036dde0650d521b26bc576aab970f20bddc1ab37a0e96fa84f58b6af20386c64a6bcf5d6320aa7e0a700039abb"

RPROVIDES:${PN} += "mawk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
