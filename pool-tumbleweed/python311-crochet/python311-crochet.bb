SUMMARY = "Use Twisted from any applications"
DESCRIPTION = "Crochet is an MIT-licensed library that makes it easier for blocking or \
threaded applications like Flask or Django to use the Twisted networking \
framework."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-crochet-2.0.0-1.8.noarch.rpm"
RPM_HASH = "ea2e4e37e2a8c71c2c2928b8b0da87a46fd333f48386893dcbe8cb96872ded808c2bdd4ba5f6f2e7167f8fd80089f2a89055fe27d2b17dcd275025fab4e16217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-crochet \
python311-crochet \
python3dist-crochet"

RDEPENDS:${PN} += "python-abi \
python311-Twisted \
python311-wrapt"

inherit rpm
