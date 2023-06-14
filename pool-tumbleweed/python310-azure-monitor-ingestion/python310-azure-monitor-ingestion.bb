SUMMARY = "Microsoft Azure Monitor Ingestion Client Library for Python"
DESCRIPTION = "The Azure Monitor Ingestion client library is used to send custom logs to Azure Monitor. \
 \
This library allows you to send data from virtually any source to supported built-in tables \
or to custom tables that you create in Log Analytics workspace. You can even extend the schema \
of built-in tables with custom columns."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-azure-monitor-ingestion-1.0.1-1.1.noarch.rpm"
RPM_HASH = "1ea92103bbb66540843dc371a969e376f99010286983153219502d1975977d7dca3b6c02178ab0eeea13ec45a6f0bbff92aadf5357a55432b91f34c007393d89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-monitor-ingestion \
python3.10dist-azure-monitor-ingestion \
python310-azure-monitor-ingestion \
python3dist-azure-monitor-ingestion"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-monitor-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
