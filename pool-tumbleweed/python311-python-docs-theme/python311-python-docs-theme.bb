SUMMARY = "The Sphinx theme for the CPython docs and related projects"
DESCRIPTION = "The Sphinx theme for the CPython docs and related projects"
LICENSE = "Python-2.0"

PV = "2022.1"

RPM_NAME = "python311-python-docs-theme-2022.1-1.13.noarch.rpm"
RPM_HASH = "ef5092659e50339f20373929a98816f1e261343b18ff1a29a14f7d4f3c4fd7f1fe61e71ddc1b76ee7f962ef7cc391e98b23883de672ebfe933982346a6b8da90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-docs-theme \
python3.11dist-python-docs-theme \
python311-python-docs-theme \
python3dist-python-docs-theme"

RDEPENDS:${PN} += "python-abi"

inherit rpm
