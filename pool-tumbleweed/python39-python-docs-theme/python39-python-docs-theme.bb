SUMMARY = "The Sphinx theme for the CPython docs and related projects"
DESCRIPTION = "The Sphinx theme for the CPython docs and related projects"
LICENSE = "Python-2.0"

PV = "2022.1"

RPM_NAME = "python39-python-docs-theme-2022.1-1.13.noarch.rpm"
RPM_HASH = "7351318305f3fa19d9a2c3e1e47730dc3a9674acee58cbb888ef0496d7c99f9a63135c2bd55dc75fc888a3be6e3e4a3cc7c9582334ce0a85c05ffa04914bd4c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-docs-theme \
python39-python-docs-theme \
python3dist-python-docs-theme"

RDEPENDS:${PN} += "python-abi"

inherit rpm
