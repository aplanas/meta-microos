SUMMARY = "A small INI library for Python"
DESCRIPTION = "A small INI library for Python."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python39-inifile-0.4.1-1.8.noarch.rpm"
RPM_HASH = "e1028b495568884ffea2df84b984ceeb1b951b9c2c4e0a88713ce1cb2315a6d17a26be102519cb6a4406fd6bd50eea5b9ef10ec9b1ac63c5613511648ed06ef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-inifile \
python39-inifile \
python3dist-inifile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
