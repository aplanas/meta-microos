SUMMARY = "Pretty printer for pytest progress"
DESCRIPTION = "pytest-sugar is a plugin for py.test that shows failures and errors instantly and shows a progress bar."
LICENSE = "BSD-3-Clause"

PV = "0.9.7"

RPM_NAME = "python39-pytest-sugar-0.9.7-2.1.noarch.rpm"
RPM_HASH = "b416a7cb858ccb31f24b2e0b60e9579bafdfb10af44d13f0a82d976727bc259abd81f9ebb070407ece988caa9d3ddd343136deddcd4264639d94c88dc7776368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-sugar \
python39-pytest-sugar \
python3dist-pytest-sugar"

RDEPENDS:${PN} += "python-abi \
python39-pytest \
python39-termcolor"

inherit rpm
