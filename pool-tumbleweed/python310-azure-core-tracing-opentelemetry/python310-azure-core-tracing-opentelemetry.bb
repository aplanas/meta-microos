SUMMARY = "Azure Core Tracing OpenTelemetry client library for Python"
DESCRIPTION = "Azure Core Tracing OpenTelemetry client library for Python"
LICENSE = "MIT"

PV = "1.0.0b10"

RPM_NAME = "python310-azure-core-tracing-opentelemetry-1.0.0b10-1.1.noarch.rpm"
RPM_HASH = "f3dc6e767f9a51ae7bdae5b5202949941a88434c370beaf24cc37812379fdc4786c19f79e179ad9832c97acc14bb2af0e80787ea895f13f475e6591b229a45c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-core-tracing-opentelemetry \
python310-azure-core-tracing-opentelemetry \
python3dist-azure-core-tracing-opentelemetry"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-opentelemetry-api"

inherit rpm
