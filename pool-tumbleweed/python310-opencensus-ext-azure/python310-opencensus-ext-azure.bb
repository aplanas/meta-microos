SUMMARY = "OpenCensus Azure Monitor Exporters"
DESCRIPTION = "OpenCensus Azure Monitor Exporters"
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "python310-opencensus-ext-azure-1.1.6-1.3.noarch.rpm"
RPM_HASH = "9eed745f74b3d7d5e8943ef87e9abde087d23464d14fd831f3ce596bfe85cd2be1bdfb2e2fd5522e0df8c80321e9f7e8e1f1a115bac0079e59996186ee0a0a71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opencensus-ext-azure \
python3.10dist(opencensus-ext-azure) \
python310-opencensus-ext-azure \
python3dist(opencensus-ext-azure)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-core \
python310-azure-identity \
python310-opencensus \
python310-psutil \
python310-requests"

inherit rpm
