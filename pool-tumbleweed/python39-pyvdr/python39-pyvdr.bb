SUMMARY = "Python library for accessing a Linux VDR via SVDRP"
DESCRIPTION = "Python library for accessing a Linux VDR via SVDRP."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python39-pyvdr-0.3.1-1.10.noarch.rpm"
RPM_HASH = "f6da877803b6875898294b7134f6aa87fad13821abb39b6a7fc14ba4729cdaff8b2c5d7de7b5917bae26cbf858fe4e1bc05b0ee4c70a6c9fdda752f2778631c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyvdr \
python39-pyvdr \
python3dist-pyvdr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
