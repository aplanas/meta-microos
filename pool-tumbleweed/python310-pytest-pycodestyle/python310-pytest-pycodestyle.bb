SUMMARY = "Pytest plugin to run pycodestyle"
DESCRIPTION = "pytest plugin to run pycodestyle in python tests"
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python310-pytest-pycodestyle-2.3.1-1.5.noarch.rpm"
RPM_HASH = "48e323cdd2cf1d760d4ce7e9d1022afd081d3087737117b7786a50de41a5d541bf86ed99146209cc048b5d48a3169529c0d38b71f905b86197522a6c9cf70d90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-pycodestyle \
python310-pytest-codestyle \
python310-pytest-pycodestyle \
python3dist-pytest-pycodestyle"

RDEPENDS:${PN} += "python-abi \
python310-py \
python310-pycodestyle \
python310-pytest \
python310-setuptools"

inherit rpm
