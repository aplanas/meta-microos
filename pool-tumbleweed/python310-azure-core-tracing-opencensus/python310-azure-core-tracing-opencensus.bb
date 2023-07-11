SUMMARY = "Azure Core Tracing OpenCensus client library for Python"
DESCRIPTION = "Azure Core Tracing OpenCensus client library for Python"
LICENSE = "MIT"

PV = "1.0.0b9"

RPM_NAME = "python310-azure-core-tracing-opencensus-1.0.0b9-1.3.noarch.rpm"
RPM_HASH = "0714bcb1b75f7cd4ba21512110cabdc9639e636bc37da87f367086c1ec8da2224cfe77d08dbd3dd68bfe7c83cb304b8e085c3e3dfa225302ad123a61eb2e2fc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-core-tracing-opencensus \
python310-azure-core-tracing-opencensus \
python3dist-azure-core-tracing-opencensus"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-opencensus \
python310-opencensus-ext-azure \
python310-opencensus-ext-threading"

inherit rpm
