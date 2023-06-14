SUMMARY = "Python bindings for the Capstone disassembly framework"
DESCRIPTION = "Capstone is a multi-architecture disassembly framework. \
 \
This package contains the Capstone bindings for Python."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python3-capstone-4.0.2-2.3.noarch.rpm"
RPM_HASH = "f9cc19a644ee72e3486ea33d81f8ded2c585ca06a4693e7dd0ebb84b389cca56c866db7c641fdba8b4d8ef238f35eb6182bf04ca1e943732653f42be95df157a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-capstone \
python3.10dist-capstone \
python3dist-capstone"

RDEPENDS:${PN} += "python-abi"

inherit rpm
