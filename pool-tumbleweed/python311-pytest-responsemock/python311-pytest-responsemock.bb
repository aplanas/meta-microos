SUMMARY = "Simplified requests calls mocking for pytest"
DESCRIPTION = "Simplified requests calls mocking for pytest."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python311-pytest-responsemock-1.1.1-1.5.noarch.rpm"
RPM_HASH = "327597614b286af28c2c626acc0e9d9b27d21209c694e6970fe8bb3ddf38527903d5ee3a2879bc1cfae72fe61b4164f574d3f8ad3959c240051179b44b640076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-responsemock \
python311-pytest-responsemock \
python3dist-pytest-responsemock"

RDEPENDS:${PN} += "python-abi \
python311-pytest \
python311-responses"

inherit rpm
