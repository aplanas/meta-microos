SUMMARY = "OpenCensus threading Integration"
DESCRIPTION = "OpenCensus threading Integration"
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "python311-opencensus-ext-threading-0.1.2-2.9.noarch.rpm"
RPM_HASH = "c556eaa4acd1a19186a69154495bfe1c79eb974876926c627b872f12ee67502b2e72a59587c99d2b6342b591f0f2b3614e8d754a3009e235f0ab223356fa13e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(opencensus-ext-threading) \
python311-opencensus-ext-threading \
python3dist(opencensus-ext-threading)"
RDEPENDS:${PN} += "python(abi) \
python311-opencensus"

inherit rpm
