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

RPM_NAME = "python310-flake8-6.1.0-1.1.noarch.rpm"
RPM_HASH = "ac6a602d49bd43c5f43dfcd80f40fded813e9c3e8ec80176fbbb7d77b23a3c0a0b7fdbafee5ff5034b7df061ea1547c731bac07c6097ee14b18ef7fbc69aceb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8 \
python310-flake8 \
python3dist-flake8"

RDEPENDS:${PN} += "-python310-mccabe >= 0.7.0 with python310-mccabe < 0.8.0 \
-python310-pycodestyle >= 2.11.0 with python310-pycodestyle < 2.12.0 \
-python310-pyflakes >= 3.1.0 with python310-pyflakes < 3.2.0 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
