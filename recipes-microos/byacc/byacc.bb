SUMMARY = "LALR(1) parser generator"
DESCRIPTION = "Berkeley Yacc is a LALR(1) parser generator. It has been made as compatible as \
possible with AT&T Yacc and it accepts any input specification that conforms to \
the AT&T Yacc documentation. In contrast to bison, it is written to avoid \
dependencies upon a particular compiler."
LICENSE = "SUSE-Public-Domain"

PV = "20230219"

RPM_NAME = "byacc-20230219-1.2.aarch64.rpm"
RPM_HASH = "7440008a0409f9b6c5780f3010f049ed13c94f78b9236ad50836eb6af6d549dd2d81f8e74894502b6e4822b70a20b9f0fcac1e8a5aef692b324b2dfb76dcd951"

RPROVIDES:${PN} += "byacc byacc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
