SUMMARY = "Plugin integrating isort in flake8"
DESCRIPTION = "Use `isort`_ to check if the imports on your python files are sorted the way you expect."
LICENSE = "GPL-2.0-only"

PV = "6.0.0"

RPM_NAME = "python39-flake8-isort-6.0.0-1.4.noarch.rpm"
RPM_HASH = "3bdc0f55ee8f7b47fe150bf775972479d1f113906977b08381b32355e4046231a9253f33284352a10eab6f28b0f532c20f3700836ae8d30bf2437881523a8d56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flake8-isort) \
python39-flake8-isort \
python3dist(flake8-isort)"

RDEPENDS:${PN} += "python(abi) \
python39-flake8 \
python39-isort \
python39-testfixtures"

inherit rpm
