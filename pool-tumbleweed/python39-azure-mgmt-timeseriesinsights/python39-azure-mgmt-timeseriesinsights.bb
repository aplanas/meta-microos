SUMMARY = "Microsoft Azure TimeSeriesInsights Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure TimeSeriesInsights Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-timeseriesinsights-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "bb3e4693d2c71a4c045eb4e82507cae688e48f91574d2158963134541c35cc0f2cfbc1aec44d204b286c50b98d8d4f53956d6fa4485505f6b9ca46dee78cc78d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-timeseriesinsights \
python39-azure-mgmt-timeseriesinsights \
python3dist-azure-mgmt-timeseriesinsights"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
