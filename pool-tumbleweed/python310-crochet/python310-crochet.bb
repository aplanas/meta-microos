SUMMARY = "Use Twisted from any applications"
DESCRIPTION = "Crochet is an MIT-licensed library that makes it easier for blocking or \
threaded applications like Flask or Django to use the Twisted networking \
framework."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-crochet-2.0.0-1.8.noarch.rpm"
RPM_HASH = "30e7eae6e64a4399418ae651a5654f27a1033fe7a4285de66b9cebcbe1ea1a424beb11b954c876be14cd1dae528208eaebf2667d8ed289ae20dd79caa2809b87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crochet \
python3.10dist-crochet \
python310-crochet \
python3dist-crochet"

RDEPENDS:${PN} += "python-abi \
python310-Twisted \
python310-wrapt"

inherit rpm
