SUMMARY = "A pytest fixture for testing flake8 plugins"
DESCRIPTION = "A pytest fixture for testing flake8 plugins."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-pytest-flake8-path-1.3.0-1.4.noarch.rpm"
RPM_HASH = "6dc654271e96b774d51fc15593c8abf55f3cf40db198be202da519e275f00618b4a4d4be0ddacb3d25d8b317936c455711e49bf63a571080dad97a3d1ccd0c32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-flake8-path \
python310-pytest-flake8-path \
python3dist-pytest-flake8-path"

RDEPENDS:${PN} += "python-abi \
python310-flake8 \
python310-pytest"

inherit rpm
