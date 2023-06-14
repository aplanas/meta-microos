SUMMARY = "Microsoft Azure Template Package Client Library for Python"
DESCRIPTION = "This template package matches necessary patterns that the development team has established to \
create a unified sdk functional from Python 2.7 onwards. The packages contained herein can be \
installed singly or as part of the azure namespace. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "0.1.0b2675288"

RPM_NAME = "python310-azure-template-0.1.0b2675288-1.1.noarch.rpm"
RPM_HASH = "a534e564a867528df10d88326ae74922d72252d93582dd831364a5ea4be2e915ab0da37e9b280feb04835d5259f2f66f1681dcb0c1061f1438f231df830409e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-template \
python3.10dist-azure-template \
python310-azure-template \
python3dist-azure-template"

RDEPENDS:${PN} += "python-abi \
python310-azure-core"

inherit rpm
