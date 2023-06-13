SUMMARY = "Plugin integrating isort in flake8"
DESCRIPTION = "Use `isort`_ to check if the imports on your python files are sorted the way you expect."
LICENSE = "GPL-2.0-only"

PV = "6.0.0"

RPM_NAME = "python310-flake8-isort-6.0.0-1.4.noarch.rpm"
RPM_HASH = "4b97d30b8acc828cf3e35e4241a53efd1cb5952d4f466d142b6a60537241b93e53312c90c1d0cc03d4860c26099e34d6c609442df2e910513ae7122f65326e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-isort \
python3.10dist(flake8-isort) \
python310-flake8-isort \
python3dist(flake8-isort)"

RDEPENDS:${PN} += "python(abi) \
python310-flake8 \
python310-isort \
python310-testfixtures"

inherit rpm
