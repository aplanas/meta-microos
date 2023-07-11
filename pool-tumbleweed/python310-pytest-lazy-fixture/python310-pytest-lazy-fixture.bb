SUMMARY = "Helper to use fixtures in pytest.markparametrize"
DESCRIPTION = "Helper to use fixtures in pytest.mark.parametrize."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python310-pytest-lazy-fixture-0.6.3-2.3.noarch.rpm"
RPM_HASH = "3a39e2bc60ccf161f109b4d31ec4b53fd20ba596958d12a990f115740a1715da125b7cca304d64cf30f631f38243eaa8e1b867fc29c68e371380692fe0e6069e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-lazy-fixture \
python310-pytest-lazy-fixture \
python3dist-pytest-lazy-fixture"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
