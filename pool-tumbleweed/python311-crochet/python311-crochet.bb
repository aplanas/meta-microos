SUMMARY = "Use Twisted from any applications"
DESCRIPTION = "Crochet is an MIT-licensed library that makes it easier for blocking or \
threaded applications like Flask or Django to use the Twisted networking \
framework."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-crochet-2.0.0-1.10.noarch.rpm"
RPM_HASH = "115a9209abfb213b7f50bbdbb2f35a1ff269ce5ba75c47aed8a38fb63fcad4b9dbc2731fec7bc40866f5e5f7bb49d97cbb9db91429b92644750fca6cfa55f1a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crochet \
python3.11dist-crochet \
python311-crochet \
python3dist-crochet"

RDEPENDS:${PN} += "python-abi \
python311-Twisted \
python311-wrapt"

inherit rpm
