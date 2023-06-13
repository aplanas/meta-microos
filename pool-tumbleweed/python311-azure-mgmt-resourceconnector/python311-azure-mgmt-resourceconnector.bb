SUMMARY = "Microsoft Azure Resourceconnector Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resourceconnector Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python311-azure-mgmt-resourceconnector-1.0.0b4-1.1.noarch.rpm"
RPM_HASH = "8729da6729d7832754c1d3dd87623b733dc36fb0bb490c970ae06a70ba9bb3dbab5ab16e53705ce477336bcb68d497e989ba9e4ba254f93dab467a2c65888ba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-resourceconnector) \
python311-azure-mgmt-resourceconnector \
python3dist(azure-mgmt-resourceconnector)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
