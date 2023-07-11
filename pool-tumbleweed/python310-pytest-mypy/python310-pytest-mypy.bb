SUMMARY = "Mypy static type checker plugin for Pytest"
DESCRIPTION = "Mypy static type checker plugin for Pytest."
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python310-pytest-mypy-0.10.3-1.5.noarch.rpm"
RPM_HASH = "40b17131522780a67ed6dd9826ea68dd9db8e50cb094d49047c1198cb963a5677c900e062a7aca7f8e3db53dcdc3980eeb52e0136cbd58c07777ba1bc333bb5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-mypy \
python310-pytest-mypy \
python3dist-pytest-mypy"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-filelock \
python310-mypy \
python310-pytest"

inherit rpm
