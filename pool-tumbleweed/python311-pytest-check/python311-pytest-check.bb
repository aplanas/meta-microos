SUMMARY = "A pytest plugin that allows multiple failures per test"
DESCRIPTION = "A pytest plugin that allows multiple failures per test. A rewrite of pytest-expect"
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python311-pytest-check-1.0.5-1.10.noarch.rpm"
RPM_HASH = "f7ba69fa2c30b6da9f84558fc75c2c38fd5bd27f1f1e4949188f7dc57847f1eecf69218ea4e1eac38830cb9f96a22f1f0eddd5500a128af06122c7d3e462a194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-check \
python3.11dist-pytest-check \
python311-pytest-check \
python3dist-pytest-check"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
