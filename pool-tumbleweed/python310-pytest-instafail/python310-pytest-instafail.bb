SUMMARY = "Pytest Plugin to Show Failures Instantly"
DESCRIPTION = "Pytest-instafail is a plugin for py.test that shows \
failures and errors instantly instead of waiting \
until the end of test session."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "python310-pytest-instafail-0.5.0-1.1.noarch.rpm"
RPM_HASH = "d2c62b69a191fc4707413edadcb9a2360b3403a23c4f80e91f96be7d542742bf99645eab873d9238e7cc0ab63322f72fa5ed25f9f406544e1d544809bdd8376b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-instafail \
python3.10dist-pytest-instafail \
python310-pytest-instafail \
python3dist-pytest-instafail"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
