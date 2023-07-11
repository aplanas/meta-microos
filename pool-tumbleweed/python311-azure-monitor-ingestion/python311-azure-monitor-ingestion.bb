SUMMARY = "Microsoft Azure Monitor Ingestion Client Library for Python"
DESCRIPTION = "The Azure Monitor Ingestion client library is used to send custom logs to Azure Monitor. \
 \
This library allows you to send data from virtually any source to supported built-in tables \
or to custom tables that you create in Log Analytics workspace. You can even extend the schema \
of built-in tables with custom columns."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python311-azure-monitor-ingestion-1.0.2-1.1.noarch.rpm"
RPM_HASH = "deb92ef13d335a5e70fe24703e74b9e5d464709be24baa75d0fa71114d2156a80da28a4702213f7762198d0bd6128a982b89f34d0adcff2c1df99c7d396fdd4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-monitor-ingestion \
python3.11dist-azure-monitor-ingestion \
python311-azure-monitor-ingestion \
python3dist-azure-monitor-ingestion"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-monitor-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
