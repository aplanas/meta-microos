SUMMARY = "Generate ELF/DWARF symbol and type information for volatility3"
DESCRIPTION = "dwarf2json is a Go utility that processes files containing symbol and type \
information to generate Volatilty3 Intermediate Symbol File (ISF) JSON output \
suitable for Linux and macOS analysis."
LICENSE = "BSD-2-Clause-Patent"

PV = "0.6.0~git.20200714T092604.d1b08fe"

RPM_NAME = "dwarf2json-0.6.0~git.20200714T092604.d1b08fe-1.13.aarch64.rpm"
RPM_HASH = "a3db05a860a7618d69299f003a233eadadeb26934e070739dbcd8468d85c5a499d4417ae58ad4c704a08d739283a9b671cffd868ad8cad74bf7754c6bd0b3194"

RPROVIDES:${PN} += "dwarf2json dwarf2json(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
