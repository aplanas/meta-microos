SUMMARY = "Plugin integrating isort in flake8"
DESCRIPTION = "Use `isort`_ to check if the imports on your python files are sorted the way you expect."
LICENSE = "GPL-2.0-only"

PV = "6.0.0"

RPM_NAME = "python311-flake8-isort-6.0.0-1.6.noarch.rpm"
RPM_HASH = "b51aa68b305b4d683e9124cbcf09bc2265090bac3ecf5f31f3ec7f6564c4bb02c5198066441419f304be350eb9993c802007bf6e1973a4320af14e60888ee249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-isort \
python3.11dist-flake8-isort \
python311-flake8-isort \
python3dist-flake8-isort"

RDEPENDS:${PN} += "python-abi \
python311-flake8 \
python311-isort \
python311-testfixtures"

inherit rpm
