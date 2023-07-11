SUMMARY = "Use Twisted from any applications"
DESCRIPTION = "Crochet is an MIT-licensed library that makes it easier for blocking or \
threaded applications like Flask or Django to use the Twisted networking \
framework."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-crochet-2.0.0-1.10.noarch.rpm"
RPM_HASH = "f5c8f64dc3adcf84169b4b24554abf6fcf30af5e3f2cb4ea39efba5abd6a2336fb48b7559d40223bed5c961a1c06ed095fbbe7cc6b484267f3045a7b6ed48f10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-crochet \
python39-crochet \
python3dist-crochet"

RDEPENDS:${PN} += "python-abi \
python39-Twisted \
python39-wrapt"

inherit rpm
