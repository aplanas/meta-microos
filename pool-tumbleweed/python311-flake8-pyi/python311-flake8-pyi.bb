SUMMARY = "A plugin for flake8 to enable linting .pyi files"
DESCRIPTION = "A plugin for Flake8 that provides specializations for type hinting stub \
files. Especially interesting for linting typeshed."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python311-flake8-pyi-23.1.2-1.4.noarch.rpm"
RPM_HASH = "79c9fcbca6d4fc2a377ac3ed56ee4752ba71a8cc4082dfb9f8d42b16fc47f35c8c436ca6f7f132270721a5f48d2788deddb22515f1a4b4b5e22ec33e5f2b7348"
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
