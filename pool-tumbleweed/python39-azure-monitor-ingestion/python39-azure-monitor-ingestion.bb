SUMMARY = "Microsoft Azure Monitor Ingestion Client Library for Python"
DESCRIPTION = "The Azure Monitor Ingestion client library is used to send custom logs to Azure Monitor. \
 \
This library allows you to send data from virtually any source to supported built-in tables \
or to custom tables that you create in Log Analytics workspace. You can even extend the schema \
of built-in tables with custom columns."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-azure-monitor-ingestion-1.0.2-1.1.noarch.rpm"
RPM_HASH = "e506b022b8270c3ea3651fdd44c84e6a8fb8a9c5717098e0bf981335d6e22e729ae118fbda4719c61ddad466bad81cbc96777f6ffefc1a91263515c9b9aaf26d"
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
