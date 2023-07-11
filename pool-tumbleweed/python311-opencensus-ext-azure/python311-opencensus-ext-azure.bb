SUMMARY = "OpenCensus Azure Monitor Exporters"
DESCRIPTION = "OpenCensus Azure Monitor Exporters"
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "python311-opencensus-ext-azure-1.1.6-1.5.noarch.rpm"
RPM_HASH = "d4aba7f1caa97f13bd4f9560907aa1b27ac9352214a626e66648b25d64cfd7be978b825ab2c6467fffa8e769459edd5c8849e15f080768d5505d474391a2f52d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opencensus-ext-azure \
python3.11dist-opencensus-ext-azure \
python311-opencensus-ext-azure \
python3dist-opencensus-ext-azure"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-identity \
python311-opencensus \
python311-psutil \
python311-requests"

inherit rpm
