SUMMARY = "Azure Core Tracing OpenTelemetry client library for Python"
DESCRIPTION = "Azure Core Tracing OpenTelemetry client library for Python"
LICENSE = "MIT"

PV = "1.0.0b11"

RPM_NAME = "python310-azure-core-tracing-opentelemetry-1.0.0b11-1.1.noarch.rpm"
RPM_HASH = "21f9902750efab5d3e9d3e70736bfec8d2be5aa86a645fa82668bfc79335608c840dcae1b627944237eb3589a158b8a9452088d9bbdc972c8cb360da6446c1c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-core-tracing-opentelemetry \
python310-azure-core-tracing-opentelemetry \
python3dist-azure-core-tracing-opentelemetry"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-opentelemetry-api"

inherit rpm
