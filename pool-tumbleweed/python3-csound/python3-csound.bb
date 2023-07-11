SUMMARY = "Csound opcodes for python"
DESCRIPTION = "Csound opcodes for python"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "python3-csound-6.18.1-3.2.aarch64.rpm"
RPM_HASH = "c2e9cfc449d209c46c733c212de0d9b23a1c782f9e5e8a2349ffd4ee907ce21b00d2077c8a0815e1bf147ffa5f467a7ce9a500cc9bb4b0a7a21a59d9004b03b3"

RPROVIDES:${PN} += "python3-csound"

RDEPENDS:${PN} += "python-abi"

inherit rpm
