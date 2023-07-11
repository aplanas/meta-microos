SUMMARY = "Azure Core Tracing OpenTelemetry client library for Python"
DESCRIPTION = "Azure Core Tracing OpenTelemetry client library for Python"
LICENSE = "MIT"

PV = "1.0.0b9"

RPM_NAME = "python310-azure-core-tracing-opentelemetry-1.0.0b9-1.10.noarch.rpm"
RPM_HASH = "e4fdd61f311da2817fbbfcb0eca84ec4d55905c8e538bad3a0ed163ec901b75493a5011982a69ca499eed8038d75669c59de24c8cb01c3656357b4cdb4b19ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-core-tracing-opentelemetry \
python310-azure-core-tracing-opentelemetry \
python3dist-azure-core-tracing-opentelemetry"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-opentelemetry-api"

inherit rpm
