SUMMARY = "Pytest Plugin to Show Failures Instantly"
DESCRIPTION = "Pytest-instafail is a plugin for py.test that shows \
failures and errors instantly instead of waiting \
until the end of test session."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "python39-pytest-instafail-0.5.0-1.3.noarch.rpm"
RPM_HASH = "c6f00ac346c2762f26bb0ba35a40cca7d31e64fc1fccb5ed8784e45567c2faf83df6fb86a32974134a49756fbf364a5e7dcac698dba0b6d29760863da417581a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-instafail \
python39-pytest-instafail \
python3dist-pytest-instafail"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
