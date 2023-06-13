SUMMARY = "Microsoft Azure Selfhelp Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Selfhelp Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-mgmt-selfhelp-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "414f5499d1f57fde85bc203d38cf2113d6f92cbe96bfcbcdfa7063478a68a55fa2e381a1226de02d6f8b35e6ee12398e4b1d54f093252cd3a0d6ba22b149ec46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-selfhelp) \
python311-azure-mgmt-selfhelp \
python3dist(azure-mgmt-selfhelp)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
