SUMMARY = "A plugin for flake8 to enable linting .pyi files"
DESCRIPTION = "A plugin for Flake8 that provides specializations for type hinting stub \
files. Especially interesting for linting typeshed."
LICENSE = "MIT"

PV = "23.6.0"

RPM_NAME = "python39-flake8-pyi-23.6.0-1.1.noarch.rpm"
RPM_HASH = "2843cf928dc4e4d2625b8775b8e3533cb85dfb27bf202e76c1be36020367137fbd998819253bc77d26c66bd242acccf132eba4519a65778ead92af5ba59c213e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-pyi \
python39-flake8-pyi \
python3dist-flake8-pyi"

RDEPENDS:${PN} += "python-abi \
python39-attrs \
python39-base \
python39-flake8 \
python39-pyflakes \
python39-typing"

inherit rpm
