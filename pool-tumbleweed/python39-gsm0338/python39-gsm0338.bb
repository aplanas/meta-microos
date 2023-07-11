SUMMARY = "Python Codec for 3GPP TS 23.038 / ETSI GSM 03.38"
DESCRIPTION = "Python Codec for 3GPP TS 23.038 / ETSI GSM 03.38. \
The codec implements the encoding and decoding methods in the \
stateless codecs.Codec class. With loading the module the \
codec get's automatically registered."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-gsm0338-1.0.0-2.5.noarch.rpm"
RPM_HASH = "683a121036fef6b49487a86ba2fdf56e60ad927086be65cf9fa93cd1ab47c0ae000016194b6533ce3502f5e06e183a7204317f3a223ccd69f1f70c058839e785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gsm0338 \
python39-gsm0338 \
python3dist-gsm0338"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
