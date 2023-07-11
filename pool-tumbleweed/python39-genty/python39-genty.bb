SUMMARY = "Python module to run a test with multiple data sets"
DESCRIPTION = "Genty, pronounced 'gen-tee', stands for 'generate tests'. It promotes \
generative testing, where a single test can execute over a variety of \
input. Genty makes this a breeze."
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "python39-genty-1.3.2-5.3.noarch.rpm"
RPM_HASH = "bbc271ac0c453c557bd447061fc15c7ea3e415be9e3c2bdd419d010448793e384276a0b8e9cc21f4b5da6713df9dfce7e46d19ddc45162573449454a67992c21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-genty \
python39-genty \
python3dist-genty"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
