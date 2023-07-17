SUMMARY = "Use Twisted from any applications"
DESCRIPTION = "Crochet is an MIT-licensed library that makes it easier for blocking or \
threaded applications like Flask or Django to use the Twisted networking \
framework."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python311-crochet-2.1.1-1.1.noarch.rpm"
RPM_HASH = "cb435526b432535c67fc2e1fc6848db34c4cd723e4868467103364c9c07f89d528c31f251ee3c38cd030b0e9d60b9248a5673c529ba28d5e3851b92171db9a7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crochet \
python3.11dist-crochet \
python311-crochet \
python3dist-crochet"

RDEPENDS:${PN} += "python-abi \
python311-Twisted \
python311-wrapt"

inherit rpm
