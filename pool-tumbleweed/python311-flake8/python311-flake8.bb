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

RPM_NAME = "python311-flake8-6.0.0-2.3.noarch.rpm"
RPM_HASH = "4592eb3f92d5d384c25d314dae6ede8551bda312fc3884c03fa77cb5e40945bd9d8590f533c284ee1be83b601638d132d46fa3f310a9e13b6a503cadd3762832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8 \
python3.11dist-flake8 \
python311-flake8 \
python3dist-flake8"

RDEPENDS:${PN} += "-python311-mccabe >= 0.7.0 with python311-mccabe < 0.8.0 \
-python311-pycodestyle >= 2.10.0 with python311-pycodestyle < 2.11.0 \
-python311-pyflakes >= 3.0.0 with python311-pyflakes < 3.1.0 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
