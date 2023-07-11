SUMMARY = "Microsoft Azure TimeSeriesInsights Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure TimeSeriesInsights Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-timeseriesinsights-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "25d4c100fa8f84e68588e570c195cfd118f2c83d75e962567d5ea8ff9bea711ec3cb220a67e308ca9ea15c7c54d4732149f5e96c41e16b1daa7a251864d8c3ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-timeseriesinsights \
python3.11dist-azure-mgmt-timeseriesinsights \
python311-azure-mgmt-timeseriesinsights \
python3dist-azure-mgmt-timeseriesinsights"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
