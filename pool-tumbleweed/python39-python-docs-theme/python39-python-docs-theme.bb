SUMMARY = "The Sphinx theme for the CPython docs and related projects"
DESCRIPTION = "The Sphinx theme for the CPython docs and related projects"
LICENSE = "Python-2.0"

PV = "2023.7"

RPM_NAME = "python39-python-docs-theme-2023.7-1.1.noarch.rpm"
RPM_HASH = "91b726607557d16180f2ab448e53108eb9771c0a9e3b5a9cddb65f0e67b300623d65d09ed475fc7914851ad5d62ff12d37bf53b29eb8ac346706491c19f95bc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-docs-theme \
python39-python-docs-theme \
python3dist-python-docs-theme"

RDEPENDS:${PN} += "python-abi"

inherit rpm
