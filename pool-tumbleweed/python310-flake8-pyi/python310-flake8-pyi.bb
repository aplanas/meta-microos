SUMMARY = "A plugin for flake8 to enable linting .pyi files"
DESCRIPTION = "A plugin for Flake8 that provides specializations for type hinting stub \
files. Especially interesting for linting typeshed."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python310-flake8-pyi-23.1.2-1.2.noarch.rpm"
RPM_HASH = "be9bd7a6be5956f772c4cc4a85e55488aab51d50a5b099b7083df7101faa9de7f40ba7f00d3e19a6beaed63f2f980139bbddab92502a7fb4e72ab31923fc5cb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-pyi \
python3.10dist(flake8-pyi) \
python310-flake8-pyi \
python3dist(flake8-pyi)"

RDEPENDS:${PN} += "python(abi) \
python310-attrs \
python310-base \
python310-flake8 \
python310-pyflakes \
python310-typing"

inherit rpm
