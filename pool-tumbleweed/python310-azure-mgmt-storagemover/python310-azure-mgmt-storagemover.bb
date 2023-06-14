SUMMARY = "Microsoft Azure Storagemover Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagemover Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-storagemover-1.0.0-1.2.noarch.rpm"
RPM_HASH = "87408662a379b26878f81dd9d39b5f69f5c29e31ffe0ae985893fa70a875d3907fff9e46dc8616990393baa5de35ba7f61d6d1d396aa7e21728ce6bb667c864f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storagemover \
python3.10dist-azure-mgmt-storagemover \
python310-azure-mgmt-storagemover \
python3dist-azure-mgmt-storagemover"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
