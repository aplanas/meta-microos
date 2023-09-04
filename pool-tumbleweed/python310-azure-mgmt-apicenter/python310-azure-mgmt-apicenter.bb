SUMMARY = "Microsoft Azure Apicenter Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Apicenter Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-mgmt-apicenter-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "da19b6916530a2fc31cff9bc0e7f375863ac22ce5b935781f3f88bfdd65a48d19c0d661fd439e0085b0d2373f8ae70f9031d0cf685fc7eb03ce72935c90a9874"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-apicenter \
python310-azure-mgmt-apicenter \
python3dist-azure-mgmt-apicenter"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
