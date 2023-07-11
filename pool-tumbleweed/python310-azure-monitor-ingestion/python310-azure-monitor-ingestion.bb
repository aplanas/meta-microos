SUMMARY = "Microsoft Azure Monitor Ingestion Client Library for Python"
DESCRIPTION = "The Azure Monitor Ingestion client library is used to send custom logs to Azure Monitor. \
 \
This library allows you to send data from virtually any source to supported built-in tables \
or to custom tables that you create in Log Analytics workspace. You can even extend the schema \
of built-in tables with custom columns."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-azure-monitor-ingestion-1.0.2-1.1.noarch.rpm"
RPM_HASH = "58bb89b7940d27dfa43178d68b916740c296d5f25a9cd7fc990b70097034e638b7acc4944038f5d2c35632bc6c1d9d23cdb5c337f8996251808619115a4849ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-monitor-ingestion \
python310-azure-monitor-ingestion \
python3dist-azure-monitor-ingestion"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-monitor-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
