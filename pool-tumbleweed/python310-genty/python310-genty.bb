SUMMARY = "Python module to run a test with multiple data sets"
DESCRIPTION = "Genty, pronounced 'gen-tee', stands for 'generate tests'. It promotes \
generative testing, where a single test can execute over a variety of \
input. Genty makes this a breeze."
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "python310-genty-1.3.2-5.3.noarch.rpm"
RPM_HASH = "e221712c0662213ae76cfe9735e84291f86411599acab73c3122c96ce775dbd2b39eb3fa2caa8ebfed5ef56eca542f1150800876f6fd0f321e17f2a470dd9943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-genty \
python310-genty \
python3dist-genty"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
