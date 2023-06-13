SUMMARY = "Use Twisted from any applications"
DESCRIPTION = "Crochet is an MIT-licensed library that makes it easier for blocking or \
threaded applications like Flask or Django to use the Twisted networking \
framework."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-crochet-2.0.0-1.8.noarch.rpm"
RPM_HASH = "fda09ae2cfddde7488a79b92755ec6b04a99e0d000ffceef23e5c671f04478e5ece6d7f4cdeb44017a13ad284b1f18bcf10cfe78cae65dd7c7678cc2c69094f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(crochet) \
python39-crochet \
python3dist(crochet)"

RDEPENDS:${PN} += "python(abi) \
python39-Twisted \
python39-wrapt"

inherit rpm
