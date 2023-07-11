SUMMARY = "Mypy static type checker plugin for Pytest"
DESCRIPTION = "Mypy static type checker plugin for Pytest."
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python39-pytest-mypy-0.10.3-1.5.noarch.rpm"
RPM_HASH = "83ff4c8c5180cca34437c71a2c703a28e68a6edd6519a9da4b45fd18339ad2e66686f47325e84e03d2421718fc46e83a4eba4563278ab7310bf470c47b1f08d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-mypy \
python39-pytest-mypy \
python3dist-pytest-mypy"

RDEPENDS:${PN} += "python-abi \
python39-attrs \
python39-filelock \
python39-mypy \
python39-pytest"

inherit rpm
