SUMMARY = "A plugin for flake8 to enable linting .pyi files"
DESCRIPTION = "A plugin for Flake8 that provides specializations for type hinting stub \
files. Especially interesting for linting typeshed."
LICENSE = "MIT"

PV = "23.6.0"

RPM_NAME = "python311-flake8-pyi-23.6.0-1.1.noarch.rpm"
RPM_HASH = "da6911e45014854cf866093a8879ef20bc879ce22740fbb8b16db314583599bceb900e91995ea2c940a94837671e6e4b45d65e44f4961dfd75db382b7303b3d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-pyi \
python3.11dist-flake8-pyi \
python311-flake8-pyi \
python3dist-flake8-pyi"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-base \
python311-flake8 \
python311-pyflakes \
python311-typing"

inherit rpm
