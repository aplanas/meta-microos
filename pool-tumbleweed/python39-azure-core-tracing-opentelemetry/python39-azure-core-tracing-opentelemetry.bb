SUMMARY = "Azure Core Tracing OpenTelemetry client library for Python"
DESCRIPTION = "Azure Core Tracing OpenTelemetry client library for Python"
LICENSE = "MIT"

PV = "1.0.0b11"

RPM_NAME = "python39-azure-core-tracing-opentelemetry-1.0.0b11-1.1.noarch.rpm"
RPM_HASH = "d3a9165d538456da620c268f7ae1207a2b2ac950f82c72986d3e67ee93bc5923249928dfad19e61fcd55433833f57fe52062a0c4517182d41589910e716d352b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-core-tracing-opentelemetry \
python39-azure-core-tracing-opentelemetry \
python3dist-azure-core-tracing-opentelemetry"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-opentelemetry-api"

inherit rpm
