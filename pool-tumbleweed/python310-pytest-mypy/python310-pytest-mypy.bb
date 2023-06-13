SUMMARY = "Mypy static type checker plugin for Pytest"
DESCRIPTION = "Mypy static type checker plugin for Pytest."
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python310-pytest-mypy-0.10.3-1.3.noarch.rpm"
RPM_HASH = "101b2b5ac0fd1abd047dcbcce52136ce1bc5b6027bca20bc0beb8061222ddc281f1227d25283e8cd60d3606725f9fc639ca0e5bbad8eb43e0877fd5e8ddcce14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mypy \
python3.10dist(pytest-mypy) \
python310-pytest-mypy \
python3dist(pytest-mypy)"

RDEPENDS:${PN} += "python(abi) \
python310-attrs \
python310-filelock \
python310-mypy \
python310-pytest"

inherit rpm
