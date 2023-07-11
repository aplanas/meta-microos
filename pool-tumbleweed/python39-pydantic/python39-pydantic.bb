SUMMARY = "Data validation and settings management using python type hinting"
DESCRIPTION = "Data validation and settings management using Python type hinting."
LICENSE = "MIT"

PV = "1.10.9"

RPM_NAME = "python39-pydantic-1.10.9-1.1.noarch.rpm"
RPM_HASH = "7202d1bd0176d5343a44d0cad9f4a39ef505782c46855f4f03d9f1c69864e118617286c623d63e95d284841255240ca8bf10416076cc62d465b4c924dc976b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydantic \
python39-pydantic \
python3dist-pydantic"

RDEPENDS:${PN} += "python-abi \
python39-typing-extensions"

inherit rpm
