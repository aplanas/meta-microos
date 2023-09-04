SUMMARY = "A plugin for flake8 to enable linting .pyi files"
DESCRIPTION = "A plugin for Flake8 that provides specializations for type hinting stub \
files. Especially interesting for linting typeshed."
LICENSE = "MIT"

PV = "23.6.0"

RPM_NAME = "python310-flake8-pyi-23.6.0-1.1.noarch.rpm"
RPM_HASH = "d41d4f19dc918e421d603c69a68b25d0a746f5093527e6b44a199a275cef0dc85e157deba72d2d7f959e1c87cb77a093ba8c15beeaaef5aa2babba265784a189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-pyi \
python310-flake8-pyi \
python3dist-flake8-pyi"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-base \
python310-flake8 \
python310-pyflakes \
python310-typing"

inherit rpm
