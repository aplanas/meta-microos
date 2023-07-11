SUMMARY = "OpenCensus threading Integration"
DESCRIPTION = "OpenCensus threading Integration"
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "python310-opencensus-ext-threading-0.1.2-2.11.noarch.rpm"
RPM_HASH = "ea9bf02e53aea2db0b7957de83721fb8ffb78294beab66da98715d012c3da3e2f9c3c248b48b28afb7c420b23924f6064a3bfe5ca7a516113a84b1b792a352df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-opencensus-ext-threading \
python310-opencensus-ext-threading \
python3dist-opencensus-ext-threading"

RDEPENDS:${PN} += "python-abi \
python310-opencensus"

inherit rpm
