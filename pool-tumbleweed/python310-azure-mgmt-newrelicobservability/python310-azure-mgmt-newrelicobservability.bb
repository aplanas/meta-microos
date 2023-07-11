SUMMARY = "Microsoft Azure Newrelicobservability Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Newrelicobservability Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-newrelicobservability-1.0.0-1.2.noarch.rpm"
RPM_HASH = "7e9a6a34dd7204c09b0347ef818287577ddef9d998eb0fcea29d7bcb26c859d37fd7da86dbee3aef9be4478d5b73a27ac3290be67e7d75423b14971d2f89f226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-newrelicobservability \
python310-azure-mgmt-newrelicobservability \
python3dist-azure-mgmt-newrelicobservability"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
