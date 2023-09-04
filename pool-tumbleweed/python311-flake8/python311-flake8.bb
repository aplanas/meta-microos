SUMMARY = "Modular source code checker: pep8, pyflakes and co"
DESCRIPTION = "Flake8 is a modular extensible source code checker including wrappers \
around these tools: \
 \
- PyFlakes \
- pep8 \
- Ned Batchelder's McCabe script \
 \
Flake8 runs all the tools by launching the single ``flake8`` script."
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python311-flake8-6.1.0-1.1.noarch.rpm"
RPM_HASH = "7b2056828b4b8787fe0d873c90a220503261a432b945b09e13c36e2b0e5a1415349a6fbc2406c2e5bbc66485aeaa87b51dd3b2cab4e6110c476c3b4504e5b070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8 \
python3.11dist-flake8 \
python311-flake8 \
python3dist-flake8"

RDEPENDS:${PN} += "-python311-mccabe >= 0.7.0 with python311-mccabe < 0.8.0 \
-python311-pycodestyle >= 2.11.0 with python311-pycodestyle < 2.12.0 \
-python311-pyflakes >= 3.1.0 with python311-pyflakes < 3.2.0 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
