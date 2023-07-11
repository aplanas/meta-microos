SUMMARY = "Microsoft Azure Search Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Search namespace package. It isn't intended to be \
installed directly. Search client libraries are located elsewhere: \
 \
* azure-search-documents \
 \
This package is for Python 2 only. It provides the necessary files for other packages \
to extend the azure namespace. Python 3.x libraries use PEP420 instead."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-search-nspkg-1.0.0-3.10.noarch.rpm"
RPM_HASH = "fd4d399890a59ca2f8e954377bf876dd50b4c74870c8f0f2625c705e2360acece97e2c4412358409f75025829b43f3f50e6cf3a52c18b0c25e35e212e21063d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-search-nspkg \
python310-azure-search-nspkg \
python3dist-azure-search-nspkg"

RDEPENDS:${PN} += "python310-azure-nspkg"

inherit rpm
