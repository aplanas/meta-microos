SUMMARY = "More descriptive output for parametrized pytest tests"
DESCRIPTION = "More descriptive output for parametrized py.test tests."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-verbose-parametrize-1.7.0-6.3.noarch.rpm"
RPM_HASH = "f3d43eb8176da05a4bc3d348dd65ea3db106cfc3bc1a686c22f79536c0f8f458057303413286412f3596cdf8f4007dfe16cd94b5b338400a11ce75360cab039c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-verbose-parametrize \
python39-pytest-verbose-parametrize \
python3dist-pytest-verbose-parametrize"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
