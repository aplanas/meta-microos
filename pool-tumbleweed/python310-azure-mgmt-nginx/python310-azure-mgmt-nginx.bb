SUMMARY = "Microsoft Azure Nginx Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Nginx Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-azure-mgmt-nginx-2.1.0-1.3.noarch.rpm"
RPM_HASH = "7d70f9dace048ad882415782503f150d625ce439ed8c0c0afc6cbe8ef7f6917a87cdb847c7cc2511f455e84859cbebdc62bd3ce7b9c017d1ca464a4eeddb8d6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-nginx \
python310-azure-mgmt-nginx \
python3dist-azure-mgmt-nginx"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
