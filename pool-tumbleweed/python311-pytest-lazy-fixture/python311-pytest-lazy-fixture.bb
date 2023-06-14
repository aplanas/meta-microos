SUMMARY = "Helper to use fixtures in pytest.markparametrize"
DESCRIPTION = "Helper to use fixtures in pytest.mark.parametrize."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python311-pytest-lazy-fixture-0.6.3-2.1.noarch.rpm"
RPM_HASH = "03461bc6b5ea5651d25f913f23e2bc9b88224ea734f7408e8cca154bd0eb4884f032625496de53e59c3e34dd96975a5092b0d30c889e4a05cd9cf96d4231cb60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-lazy-fixture \
python311-pytest-lazy-fixture \
python3dist-pytest-lazy-fixture"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
