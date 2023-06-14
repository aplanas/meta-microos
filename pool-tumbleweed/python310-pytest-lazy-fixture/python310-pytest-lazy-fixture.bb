SUMMARY = "Helper to use fixtures in pytest.markparametrize"
DESCRIPTION = "Helper to use fixtures in pytest.mark.parametrize."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python310-pytest-lazy-fixture-0.6.3-2.1.noarch.rpm"
RPM_HASH = "2fe392d2c1835a40b1cfd99a4b9c596b23d733b0865641fcaec55debcb126091017bbf88e6e291ca5795310ba17aa1f14229e856025d02a12d678960d8a13d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-lazy-fixture \
python3.10dist-pytest-lazy-fixture \
python310-pytest-lazy-fixture \
python3dist-pytest-lazy-fixture"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
