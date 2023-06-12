SUMMARY = "The Sphinx theme for the CPython docs and related projects"
DESCRIPTION = "The Sphinx theme for the CPython docs and related projects"
LICENSE = "Python-2.0"

PV = "2022.1"

RPM_NAME = "python311-python-docs-theme-2022.1-1.11.noarch.rpm"
RPM_HASH = "d918f725529a83e5e8a24c16117ba381e0b5e71285e4eddbadef87240a2793c90d97d65a03b83eeaf8621db24fa9a570190d1e0c3ffe0534dfc3ff867c4da45b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-docs-theme) \
python311-python-docs-theme \
python3dist(python-docs-theme)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
