SUMMARY = "Mypy static type checker plugin for Pytest"
DESCRIPTION = "Mypy static type checker plugin for Pytest."
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python311-pytest-mypy-0.10.3-1.5.noarch.rpm"
RPM_HASH = "9d2dd149eec8e27afcd00e933377b74b2e941ca478a5d64159b8fee6064a09051f291eb119ead392f5f9e81d592fb6c518c454b2849a3931a92b638c4c967a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mypy \
python3.11dist-pytest-mypy \
python311-pytest-mypy \
python3dist-pytest-mypy"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-filelock \
python311-mypy \
python311-pytest"

inherit rpm
