SUMMARY = "Azure Core Tracing OpenCensus client library for Python"
DESCRIPTION = "Azure Core Tracing OpenCensus client library for Python"
LICENSE = "MIT"

PV = "1.0.0b9"

RPM_NAME = "python39-azure-core-tracing-opencensus-1.0.0b9-1.3.noarch.rpm"
RPM_HASH = "945e20cad87f7d14554a9ff7a99eaef9d4f9ba9b181dbb9d88c42a01b966fb178e84f89bdf34bec3544b572b2ecb4c35f3bfd6ef967b2ae332475937661e483e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-core-tracing-opencensus \
python39-azure-core-tracing-opencensus \
python3dist-azure-core-tracing-opencensus"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-opencensus \
python39-opencensus-ext-azure \
python39-opencensus-ext-threading"

inherit rpm
