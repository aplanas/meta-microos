SUMMARY = "Python bindings for the Capstone disassembly framework"
DESCRIPTION = "Capstone is a multi-architecture disassembly framework. \
 \
This package contains the Capstone bindings for Python."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python3-capstone-4.0.2-2.4.noarch.rpm"
RPM_HASH = "aec8fef33959a1476783efb40f7330fd265ec31640351c2c6adfffb3255103d1794ccd09164bf6447a5fa941d1095d5a3b8769b7f3bcefbea9283da027ab2f23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-capstone \
python3.11dist-capstone \
python3dist-capstone"

RDEPENDS:${PN} += "python-abi"

inherit rpm
