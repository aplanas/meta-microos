SUMMARY = "OpenCensus Azure Monitor Exporters"
DESCRIPTION = "OpenCensus Azure Monitor Exporters"
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "python310-opencensus-ext-azure-1.1.6-1.5.noarch.rpm"
RPM_HASH = "d5567fe6ddb1bef248340d37d1e0950bc9400d7fb40a818481bb3e32f135eb35df7e5f6cb636fd2ff8a191cec212d5c59f88be077a10121edc815b3642d19a53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-opencensus-ext-azure \
python310-opencensus-ext-azure \
python3dist-opencensus-ext-azure"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-identity \
python310-opencensus \
python310-psutil \
python310-requests"

inherit rpm
