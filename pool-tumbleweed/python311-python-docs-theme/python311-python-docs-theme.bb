SUMMARY = "The Sphinx theme for the CPython docs and related projects"
DESCRIPTION = "The Sphinx theme for the CPython docs and related projects"
LICENSE = "Python-2.0"

PV = "2023.7"

RPM_NAME = "python311-python-docs-theme-2023.7-1.1.noarch.rpm"
RPM_HASH = "3c7798fec838b810b1a7a6501d24e94656ac3b968cbc9a452c7e60e321136bb5fc8c90c1ca114abdf5200874cf0268be517ec3a1764b1cb1fb3d1cccce19da3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-docs-theme \
python3.11dist-python-docs-theme \
python311-python-docs-theme \
python3dist-python-docs-theme"

RDEPENDS:${PN} += "python-abi"

inherit rpm
