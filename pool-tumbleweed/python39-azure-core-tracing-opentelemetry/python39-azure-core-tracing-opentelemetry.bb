SUMMARY = "Azure Core Tracing OpenTelemetry client library for Python"
DESCRIPTION = "Azure Core Tracing OpenTelemetry client library for Python"
LICENSE = "MIT"

PV = "1.0.0b9"

RPM_NAME = "python39-azure-core-tracing-opentelemetry-1.0.0b9-1.8.noarch.rpm"
RPM_HASH = "558efe617c5d70137cdecb9220efb19bdeaef605d761f00cdd3ef8cd6e1cc626db8b1f1ae0074408b89b9df70126f500f31518243ba4bd875de59b72c0476657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-core-tracing-opentelemetry) \
python39-azure-core-tracing-opentelemetry \
python3dist(azure-core-tracing-opentelemetry)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-core \
python39-azure-nspkg \
python39-opentelemetry-api"

inherit rpm
