SUMMARY = "Python Codec for 3GPP TS 23.038 / ETSI GSM 03.38"
DESCRIPTION = "Python Codec for 3GPP TS 23.038 / ETSI GSM 03.38. \
The codec implements the encoding and decoding methods in the \
stateless codecs.Codec class. With loading the module the \
codec get's automatically registered."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-gsm0338-1.0.0-2.3.noarch.rpm"
RPM_HASH = "d31e5ec29da619734d5e4500d3fd0ae7e2c5b758d3e2b1a7d0dfaefb78cc9afe6daa39b3ae840c4796ea22c7cf4074eec3ad69dc21d5087f71176bc2679cff00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gsm0338 \
python39-gsm0338 \
python3dist-gsm0338"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
