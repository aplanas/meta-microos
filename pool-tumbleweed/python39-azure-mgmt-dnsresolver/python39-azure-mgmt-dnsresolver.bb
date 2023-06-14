SUMMARY = "Microsoft Azure Dnsresolver Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dnsresolver Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-dnsresolver-1.0.0-1.3.noarch.rpm"
RPM_HASH = "b261d35b859fd911499c92d88283729ca1877ac22e8ac2d884569d8800efcc89fc5c13024c57a66f3e1e797948cae6147a17a07e85faef149eb476f4004f4c89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-dnsresolver \
python39-azure-mgmt-dnsresolver \
python3dist-azure-mgmt-dnsresolver"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
