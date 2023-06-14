SUMMARY = "Azure Core Tracing OpenTelemetry client library for Python"
DESCRIPTION = "Azure Core Tracing OpenTelemetry client library for Python"
LICENSE = "MIT"

PV = "1.0.0b9"

RPM_NAME = "python310-azure-core-tracing-opentelemetry-1.0.0b9-1.8.noarch.rpm"
RPM_HASH = "bed84774992dfaf5d34d14db54b3c616d7f17cd0df49ed45b2924ac72f4ea0e294e2aaccd93b2a066de067d00a5597eed029183d8a04388b94cdd14e50da20b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-core-tracing-opentelemetry \
python3.10dist-azure-core-tracing-opentelemetry \
python310-azure-core-tracing-opentelemetry \
python3dist-azure-core-tracing-opentelemetry"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-opentelemetry-api"

inherit rpm
