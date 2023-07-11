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

PV = "6.0.0"

RPM_NAME = "python310-flake8-6.0.0-2.3.noarch.rpm"
RPM_HASH = "45799e6f9b8092e61e189dec498be146b6ba7f4973408ebec4ec5f6164890d103811e5fe9158a82e1ac75c560a1c63ec665fb110326cc08b1b66ccdeb6c8ea46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8 \
python310-flake8 \
python3dist-flake8"

RDEPENDS:${PN} += "-python310-mccabe >= 0.7.0 with python310-mccabe < 0.8.0 \
-python310-pycodestyle >= 2.10.0 with python310-pycodestyle < 2.11.0 \
-python310-pyflakes >= 3.0.0 with python310-pyflakes < 3.1.0 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
