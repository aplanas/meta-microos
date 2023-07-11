SUMMARY = "Extension for pytest to enforce minimum tests pass"
DESCRIPTION = "PyTest Plus extends pytest functionality to enforce PYTEST_REQPASS tests passed."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-pytest-plus-0.4.0-1.3.noarch.rpm"
RPM_HASH = "3387724d0fc2b455bf4a674392fbc1d2f4ee9c20ef4f3c2626d7fd12e2ac429608509a76df59a864e7b5f6469e3167d63da3755e494335c05b34f4f76f143234"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-plus \
python39-pytest-plus \
python3dist-pytest-plus"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
