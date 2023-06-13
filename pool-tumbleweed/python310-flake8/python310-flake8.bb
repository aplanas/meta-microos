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

RPM_NAME = "python310-flake8-6.0.0-2.1.noarch.rpm"
RPM_HASH = "2cd095090b40b24c0e3d5ffe8971b937e851972b819ce1dc2b5b1d73e9b8a5b156e6e708d6ff436bda2c51ce855b7a5759b117d1af7ddc23217a136a7af46ceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8 \
python3.10dist(flake8) \
python310-flake8 \
python3dist(flake8)"

RDEPENDS:${PN} += "(python310-mccabe >= 0.7.0 with python310-mccabe < 0.8.0) \
(python310-pycodestyle >= 2.10.0 with python310-pycodestyle < 2.11.0) \
(python310-pyflakes >= 3.0.0 with python310-pyflakes < 3.1.0) \
/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
