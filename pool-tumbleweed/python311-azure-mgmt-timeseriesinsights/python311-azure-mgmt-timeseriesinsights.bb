SUMMARY = "Microsoft Azure TimeSeriesInsights Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure TimeSeriesInsights Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-timeseriesinsights-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "504404f24da67f6482189b62701e70fd7047d13e83ae035f3be8cd22a9f53bf6afe089c3f379e91648e60ad9f0d5c00632117eab9eda409b36e5e6d867e0cc39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-timeseriesinsights) \
python311-azure-mgmt-timeseriesinsights \
python3dist(azure-mgmt-timeseriesinsights)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
