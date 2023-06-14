SUMMARY = "Microsoft Azure Monitor Ingestion Client Library for Python"
DESCRIPTION = "The Azure Monitor Ingestion client library is used to send custom logs to Azure Monitor. \
 \
This library allows you to send data from virtually any source to supported built-in tables \
or to custom tables that you create in Log Analytics workspace. You can even extend the schema \
of built-in tables with custom columns."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-azure-monitor-ingestion-1.0.1-1.1.noarch.rpm"
RPM_HASH = "704071f9e437263e522034b9edc3a4b1c89d5cc498650e1400a7e2e52586223e522deb04f73f93daf3114d237842654506676b9248ab1a58b5f7965ec98b48b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-monitor-ingestion \
python39-azure-monitor-ingestion \
python3dist-azure-monitor-ingestion"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-monitor-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
