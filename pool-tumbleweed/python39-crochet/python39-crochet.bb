SUMMARY = "Use Twisted from any applications"
DESCRIPTION = "Crochet is an MIT-licensed library that makes it easier for blocking or \
threaded applications like Flask or Django to use the Twisted networking \
framework."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python39-crochet-2.1.1-1.1.noarch.rpm"
RPM_HASH = "eca99311ebbad85cad11a9f692a3a1756dab53080ae096ae1201998a0e6cd2c0ab672fa730162e517b5bcdf867d02af58633a4cc996b907e0cb27bb4c126db41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-crochet \
python39-crochet \
python3dist-crochet"

RDEPENDS:${PN} += "python-abi \
python39-Twisted \
python39-wrapt"

inherit rpm
