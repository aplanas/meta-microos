SUMMARY = "Python Codec for 3GPP TS 23.038 / ETSI GSM 03.38"
DESCRIPTION = "Python Codec for 3GPP TS 23.038 / ETSI GSM 03.38. \
The codec implements the encoding and decoding methods in the \
stateless codecs.Codec class. With loading the module the \
codec get's automatically registered."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-gsm0338-1.0.0-2.5.noarch.rpm"
RPM_HASH = "cc05e83f1463bc77bc771a5b892e2e6b17c8fc4c65b078dabfdd2892ead6e2e766a7b41356e00f828b021c7bd9c88ba57c2bf0d680fd51d6c81c00ab90efe8e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gsm0338 \
python310-gsm0338 \
python3dist-gsm0338"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
