SUMMARY = "Python Codec for 3GPP TS 23.038 / ETSI GSM 03.38"
DESCRIPTION = "Python Codec for 3GPP TS 23.038 / ETSI GSM 03.38. \
The codec implements the encoding and decoding methods in the \
stateless codecs.Codec class. With loading the module the \
codec get's automatically registered."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-gsm0338-1.0.0-2.5.noarch.rpm"
RPM_HASH = "612a0fa0bed123d1889247e01c28da98f7fbc7742a3126d6434894453972d492368b8da79c13c05f8a5ac23a68aaf14bcc9d0169325e0ddd9eda169cdde615f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gsm0338 \
python3.11dist-gsm0338 \
python311-gsm0338 \
python3dist-gsm0338"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
