SUMMARY = "More descriptive output for parametrized pytest tests"
DESCRIPTION = "More descriptive output for parametrized py.test tests."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-verbose-parametrize-1.7.0-6.5.noarch.rpm"
RPM_HASH = "7a8fc4679ca46d3b8756d1f0c70539677ffe10dc23c3e51de4b13c1739f40c60e1c6678ed98ac15972b3d426a1bcdf96c33b807783eca8d8dae3304d0bccbde0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-verbose-parametrize \
python3.11dist-pytest-verbose-parametrize \
python311-pytest-verbose-parametrize \
python3dist-pytest-verbose-parametrize"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
