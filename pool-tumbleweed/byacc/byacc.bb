SUMMARY = "LALR(1) parser generator"
DESCRIPTION = "Berkeley Yacc is a LALR(1) parser generator. It has been made as compatible as \
possible with AT&T Yacc and it accepts any input specification that conforms to \
the AT&T Yacc documentation. In contrast to bison, it is written to avoid \
dependencies upon a particular compiler."
LICENSE = "SUSE-Public-Domain"

PV = "20230521"

RPM_NAME = "byacc-20230521-1.1.aarch64.rpm"
RPM_HASH = "859a3470f2f942990a0976a1e80df7dc049f9f4f7bc516e33c62f9822d880895bf586090068e36199d4d7407e532ba77690cfbc41ebb517ee297fe66950c8482"

RPROVIDES:${PN} += "byacc \
byacc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
