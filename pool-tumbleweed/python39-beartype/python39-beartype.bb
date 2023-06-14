SUMMARY = "Unbearably fast runtime type checking in pure Python"
DESCRIPTION = "Unbearably fast runtime type checking in pure Python."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python39-beartype-0.14.0-1.1.noarch.rpm"
RPM_HASH = "059f402257ad7e3284657da7448418ae4a9cf8fbd90eeec441533dc3f50821410107298acd09b829113cb077df397c89ab5e2bbf2214028bc7dc4aa27fa25dba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-beartype \
python39-beartype \
python3dist-beartype"

RDEPENDS:${PN} += "python-abi"

inherit rpm
