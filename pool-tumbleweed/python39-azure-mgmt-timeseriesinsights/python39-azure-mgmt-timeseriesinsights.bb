SUMMARY = "Microsoft Azure TimeSeriesInsights Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure TimeSeriesInsights Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-timeseriesinsights-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "0a668ce0811017d87f23d0d9360ec3ab5da49eca3f526cd55dbaa6cefbe5bb0234fb4285dae20db9aac01830a87d454d02a11dd72ccb68f58a61a6c5ba03077f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-timeseriesinsights) \
python39-azure-mgmt-timeseriesinsights \
python3dist(azure-mgmt-timeseriesinsights)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
