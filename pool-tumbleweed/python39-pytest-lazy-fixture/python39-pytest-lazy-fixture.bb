SUMMARY = "Helper to use fixtures in pytest.markparametrize"
DESCRIPTION = "Helper to use fixtures in pytest.mark.parametrize."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python39-pytest-lazy-fixture-0.6.3-2.3.noarch.rpm"
RPM_HASH = "9acbff7404b86e48034094d2c7a0619871af9e82ceeed371b4bb28a2c209a65eafd1b32433f35a46772479bb4abee3866688f514caf7a2b730751dc678167127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-lazy-fixture \
python39-pytest-lazy-fixture \
python3dist-pytest-lazy-fixture"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
