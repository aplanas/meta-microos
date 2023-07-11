SUMMARY = "Microsoft Azure Newrelicobservability Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Newrelicobservability Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-newrelicobservability-1.0.0-1.2.noarch.rpm"
RPM_HASH = "b88991e6f5546692fab14393c285d5a670df75692167742d400e3ccbc4acf6125cde53991f929f7a611ef3cf7d83cfc5cc24a6d1cd6dd486d3e6d2d3c545e427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-newrelicobservability \
python39-azure-mgmt-newrelicobservability \
python3dist-azure-mgmt-newrelicobservability"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
