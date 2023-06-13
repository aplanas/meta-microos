SUMMARY = "Azure Core Tracing OpenCensus client library for Python"
DESCRIPTION = "Azure Core Tracing OpenCensus client library for Python"
LICENSE = "MIT"

PV = "1.0.0b9"

RPM_NAME = "python39-azure-core-tracing-opencensus-1.0.0b9-1.1.noarch.rpm"
RPM_HASH = "702856f45cd1fb5a0ac595edf7103699d4bce238c35c51c7a0c0984b454b7454f5a23f10a6e364289946b28347c37dc1fe293ebce73de713dd0895f78fd28bec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-core-tracing-opencensus) \
python39-azure-core-tracing-opencensus \
python3dist(azure-core-tracing-opencensus)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-core \
python39-azure-nspkg \
python39-opencensus \
python39-opencensus-ext-azure \
python39-opencensus-ext-threading"

inherit rpm
