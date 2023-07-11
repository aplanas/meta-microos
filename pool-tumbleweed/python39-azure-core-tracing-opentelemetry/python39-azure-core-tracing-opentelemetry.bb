SUMMARY = "Azure Core Tracing OpenTelemetry client library for Python"
DESCRIPTION = "Azure Core Tracing OpenTelemetry client library for Python"
LICENSE = "MIT"

PV = "1.0.0b9"

RPM_NAME = "python39-azure-core-tracing-opentelemetry-1.0.0b9-1.10.noarch.rpm"
RPM_HASH = "731d9eb4463e7717560eb7426fa66886c769d5c9234cb03350f7a50304767d4300a01322c9e040ac14d349f6a5f2f725f2eb17142945826d3f07449accde6ca1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-core-tracing-opentelemetry \
python39-azure-core-tracing-opentelemetry \
python3dist-azure-core-tracing-opentelemetry"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-opentelemetry-api"

inherit rpm
