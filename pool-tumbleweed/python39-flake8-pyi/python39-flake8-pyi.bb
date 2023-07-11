SUMMARY = "A plugin for flake8 to enable linting .pyi files"
DESCRIPTION = "A plugin for Flake8 that provides specializations for type hinting stub \
files. Especially interesting for linting typeshed."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python39-flake8-pyi-23.1.2-1.4.noarch.rpm"
RPM_HASH = "53f954d86c7a25cd54d0cd4a5e54fdc7c839a66300d8e57ccd4fcc4a0eb0bcbd69bea6c9a2ea0c85f46c7a4f68d7599c5be8cd4f55362ed896e335b6ec405f34"
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
