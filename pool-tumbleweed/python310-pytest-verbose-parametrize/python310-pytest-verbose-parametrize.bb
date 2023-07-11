SUMMARY = "More descriptive output for parametrized pytest tests"
DESCRIPTION = "More descriptive output for parametrized py.test tests."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-verbose-parametrize-1.7.0-6.5.noarch.rpm"
RPM_HASH = "b954a4995ac3c082fb98cd191348f40827bc9b7a73e97fc7b784b893536acf050e527ea2db66754a444cbf3a6697f5c843cb72467ebbdc705da5a1acf91a0a1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-verbose-parametrize \
python310-pytest-verbose-parametrize \
python3dist-pytest-verbose-parametrize"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
