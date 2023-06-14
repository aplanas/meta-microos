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

RPM_NAME = "python311-flake8-6.0.0-2.1.noarch.rpm"
RPM_HASH = "cee117d3438e83c59e13588fce37f032a7422c146314c96f9806892a46c948848177bde7a9cf77c225f752200410a4371e2e170643381bab4fe68cabe7b7b84d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flake8 \
python311-flake8 \
python3dist-flake8"

RDEPENDS:${PN} += "-python311-mccabe >= 0.7.0 with python311-mccabe < 0.8.0 \
-python311-pycodestyle >= 2.10.0 with python311-pycodestyle < 2.11.0 \
-python311-pyflakes >= 3.0.0 with python311-pyflakes < 3.1.0 \
/bin/sh \
/usr/bin/python3.11 \
python-abi \
update-alternatives"

inherit rpm
