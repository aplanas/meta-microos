SUMMARY = "Azure Core Tracing OpenTelemetry client library for Python"
DESCRIPTION = "Azure Core Tracing OpenTelemetry client library for Python"
LICENSE = "MIT"

PV = "1.0.0b9"

RPM_NAME = "python311-azure-core-tracing-opentelemetry-1.0.0b9-1.10.noarch.rpm"
RPM_HASH = "ec8e7411389d85afa6df230c431123f5a6dcb3a83db02895c6c2d0b9c0932bbdc6a8601617cc17abf15286810db47a2d7ada995e753b253448c28b8e2b5d2f9e"
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
