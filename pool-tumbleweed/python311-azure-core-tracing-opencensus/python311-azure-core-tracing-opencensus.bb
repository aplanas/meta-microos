SUMMARY = "Azure Core Tracing OpenCensus client library for Python"
DESCRIPTION = "Azure Core Tracing OpenCensus client library for Python"
LICENSE = "MIT"

PV = "1.0.0b9"

RPM_NAME = "python311-azure-core-tracing-opencensus-1.0.0b9-1.3.noarch.rpm"
RPM_HASH = "b5068cae3833074305b926c06029143d237220da5c3fa5293c0fc966288dabfd11e4f8e2703cee92fa85f5f0f2681e5385c68cd5c0c8caacb3be27bdf769a51b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-core-tracing-opencensus \
python3.11dist-azure-core-tracing-opencensus \
python311-azure-core-tracing-opencensus \
python3dist-azure-core-tracing-opencensus"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-opencensus \
python311-opencensus-ext-azure \
python311-opencensus-ext-threading"

inherit rpm
