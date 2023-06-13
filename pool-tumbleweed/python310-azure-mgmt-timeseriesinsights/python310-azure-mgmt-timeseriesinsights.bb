SUMMARY = "Microsoft Azure TimeSeriesInsights Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure TimeSeriesInsights Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-timeseriesinsights-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "b9325de6c3b38d905f3efe3b84c8facb0ac7aef4833728dd45dff0e4918ae6d6aff3354f7f6d33c1e2e765ba9539709feba5f8baf27df6089eb3b3e2ab23d761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-timeseriesinsights \
python3.10dist(azure-mgmt-timeseriesinsights) \
python310-azure-mgmt-timeseriesinsights \
python3dist(azure-mgmt-timeseriesinsights)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
