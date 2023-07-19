SUMMARY = "Azure Core Tracing OpenTelemetry client library for Python"
DESCRIPTION = "Azure Core Tracing OpenTelemetry client library for Python"
LICENSE = "MIT"

PV = "1.0.0b10"

RPM_NAME = "python39-azure-core-tracing-opentelemetry-1.0.0b10-1.1.noarch.rpm"
RPM_HASH = "dbdfbacadfd93c2802c79a3f383fd91be5ea4472a9a118411c349acff9d2f89d6156f2751336feefee3dd207bf2ad2130a21b635753287d97ad4031f693e131b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-core-tracing-opentelemetry \
python39-azure-core-tracing-opentelemetry \
python3dist-azure-core-tracing-opentelemetry"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-opentelemetry-api"

inherit rpm
