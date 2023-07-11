SUMMARY = "Microsoft Azure TimeSeriesInsights Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure TimeSeriesInsights Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-timeseriesinsights-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "cee64672bcc2343a7d057f8e2c4d6262259bdeacf4c3f0adc2abefb873add69e56d5a0401d0646e3fe7a3b5f03ea41e30e0c556f637fb7592333e623c3a3c692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-timeseriesinsights \
python310-azure-mgmt-timeseriesinsights \
python3dist-azure-mgmt-timeseriesinsights"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
