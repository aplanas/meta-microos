SUMMARY = "Generate ELF/DWARF symbol and type information for volatility3"
DESCRIPTION = "dwarf2json is a Go utility that processes files containing symbol and type \
information to generate Volatilty3 Intermediate Symbol File (ISF) JSON output \
suitable for Linux and macOS analysis."
LICENSE = "BSD-2-Clause-Patent"

PV = "0.6.0~git.20200714T092604.d1b08fe"

RPM_NAME = "dwarf2json-0.6.0~git.20200714T092604.d1b08fe-1.14.aarch64.rpm"
RPM_HASH = "5f9f5a68e924961a20b149ccdb55437e9ee109494213b414de3985a81aa8bc7efba4f7f35cbf72d9206559ae4aa0b251f868031ba07ec141f8b13734f480036b"

RPROVIDES:${PN} += "dwarf2json"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
