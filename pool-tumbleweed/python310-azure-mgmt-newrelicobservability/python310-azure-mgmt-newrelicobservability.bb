SUMMARY = "Microsoft Azure Newrelicobservability Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Newrelicobservability Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-newrelicobservability-1.0.0-1.1.noarch.rpm"
RPM_HASH = "39afb4a399b1c3f184199f24989083e2723b7170da78fdee348051548717e6e23630dd8673821025c04f3be2a6d7b2aa6a405f45718f97f98324e63d38310b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-newrelicobservability \
python3.10dist-azure-mgmt-newrelicobservability \
python310-azure-mgmt-newrelicobservability \
python3dist-azure-mgmt-newrelicobservability"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
