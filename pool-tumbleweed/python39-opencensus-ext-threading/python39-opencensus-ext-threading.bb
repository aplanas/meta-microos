SUMMARY = "OpenCensus threading Integration"
DESCRIPTION = "OpenCensus threading Integration"
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "python39-opencensus-ext-threading-0.1.2-2.11.noarch.rpm"
RPM_HASH = "b9529bc5c6f7834a206785d9a31eea45c0898aa3e0214853ee9ca3982f5e7e1272c771c287b2df3deef70977eb1237d913d9d222f2fc3d29ef71eb6ce9c71d1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-opencensus-ext-threading \
python39-opencensus-ext-threading \
python3dist-opencensus-ext-threading"

RDEPENDS:${PN} += "python-abi \
python39-opencensus"

inherit rpm
