SUMMARY = "Pytest plugin to exit successfully when a required percent of tests pass"
DESCRIPTION = "Change the exit code of pytest test sessions when a required percent of tests pass."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-pytest-percent-0.1.2-1.14.noarch.rpm"
RPM_HASH = "2b296fdb2d5ab9f6a7f0825f6a15c48d8076ba30033581d9bf67f6e32b2b8b82c578bf6a48691d9aa5c02de297f5d4bbaa1b6d362f442e00454def81bb25566f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-percent \
python39-pytest-percent \
python3dist-pytest-percent"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
