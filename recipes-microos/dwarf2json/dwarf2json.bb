SUMMARY = "Generate ELF/DWARF symbol and type information for volatility3"
DESCRIPTION = "dwarf2json is a Go utility that processes files containing symbol and type \
information to generate Volatilty3 Intermediate Symbol File (ISF) JSON output \
suitable for Linux and macOS analysis."
LICENSE = "BSD-2-Clause-Patent"

PV = "0.6.0~git.20200714T092604.d1b08fe"

RPM_NAME = "dwarf2json-0.6.0~git.20200714T092604.d1b08fe-1.12.aarch64.rpm"
RPM_HASH = "a2d32a7fb7a4c781923b67bf7a3cfbe5ddedac70eb1953ace2d5700c874b5c43cb30fb3c361c03918ffbf3b87362ab7e0e65aec80257ce944824b2b3efb134db"

RPROVIDES:${PN} += "dwarf2json dwarf2json(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
