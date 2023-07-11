SUMMARY = "More descriptive output for parametrized pytest tests"
DESCRIPTION = "More descriptive output for parametrized py.test tests."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-verbose-parametrize-1.7.0-6.5.noarch.rpm"
RPM_HASH = "a5d2000ee6b11bb4979ac17a111f13cf7e9aad73d9cfc5f83982f7cc8ba1253f751b831153f4f22d5f50be1a6b03ea6b2871eff3aef57814985c6fdbe5781750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-verbose-parametrize \
python39-pytest-verbose-parametrize \
python3dist-pytest-verbose-parametrize"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
