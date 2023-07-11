SUMMARY = "Helper to use fixtures in pytest.markparametrize"
DESCRIPTION = "Helper to use fixtures in pytest.mark.parametrize."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python311-pytest-lazy-fixture-0.6.3-2.3.noarch.rpm"
RPM_HASH = "a90c4721d58d526bf0a23971706d096be7d992fe973af79d7056c00b4194be5c00b7ff71109da5a316f47e2c1eab4382b74dc450f6fc46bb93a8e7a73dd0beb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-lazy-fixture \
python3.11dist-pytest-lazy-fixture \
python311-pytest-lazy-fixture \
python3dist-pytest-lazy-fixture"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
