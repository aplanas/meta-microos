SUMMARY = "Azure Core Tracing OpenTelemetry client library for Python"
DESCRIPTION = "Azure Core Tracing OpenTelemetry client library for Python"
LICENSE = "MIT"

PV = "1.0.0b10"

RPM_NAME = "python311-azure-core-tracing-opentelemetry-1.0.0b10-1.1.noarch.rpm"
RPM_HASH = "bbb5c57f4b8459c5718b4b15cdad13b181f296c01bc7b4c7bc6b06943865e1138ee2ae3247e87ebe3750986d813bef01a34a326a46a794347d65fa8adfa2adfe"
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
