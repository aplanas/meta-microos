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

RPM_NAME = "python39-flake8-6.1.0-1.1.noarch.rpm"
RPM_HASH = "e60bd48c76bf05f472ed93fd1709bec5c3abf795ca24650bea68ba81456becd96f85c4eb0329e9eeed48f22ae4f1a0eba9346098122a3d34d59c99e9d0f13edc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8 \
python39-flake8 \
python3dist-flake8"

RDEPENDS:${PN} += "-python39-mccabe >= 0.7.0 with python39-mccabe < 0.8.0 \
-python39-pycodestyle >= 2.11.0 with python39-pycodestyle < 2.12.0 \
-python39-pyflakes >= 3.1.0 with python39-pyflakes < 3.2.0 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
