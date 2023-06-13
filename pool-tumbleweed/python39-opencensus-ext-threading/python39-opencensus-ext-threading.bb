SUMMARY = "OpenCensus threading Integration"
DESCRIPTION = "OpenCensus threading Integration"
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "python39-opencensus-ext-threading-0.1.2-2.9.noarch.rpm"
RPM_HASH = "d29b9582e3f24452eaf29918f3397aa79554f84def0737ab7d18266eea4d3c231fd11afaad41f81b515c406533826d5c6ad2a18f65ab13b65a2802f903cd4e17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(opencensus-ext-threading) \
python39-opencensus-ext-threading \
python3dist(opencensus-ext-threading)"

RDEPENDS:${PN} += "python(abi) \
python39-opencensus"

inherit rpm
