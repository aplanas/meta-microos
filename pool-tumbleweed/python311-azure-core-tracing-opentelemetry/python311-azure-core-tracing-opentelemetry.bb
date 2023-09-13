SUMMARY = "Azure Core Tracing OpenTelemetry client library for Python"
DESCRIPTION = "Azure Core Tracing OpenTelemetry client library for Python"
LICENSE = "MIT"

PV = "1.0.0b11"

RPM_NAME = "python311-azure-core-tracing-opentelemetry-1.0.0b11-1.1.noarch.rpm"
RPM_HASH = "fb7edcc8cb48d6681f362ba2a3a911b6f057a68b49d7b1aa05041a0943f6766225bf00bb5640c528c16999cccfee80a8d0430d2068f6928b25395e04c8d3a835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-core-tracing-opentelemetry \
python3.11dist-azure-core-tracing-opentelemetry \
python311-azure-core-tracing-opentelemetry \
python3dist-azure-core-tracing-opentelemetry"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-opentelemetry-api"

inherit rpm
