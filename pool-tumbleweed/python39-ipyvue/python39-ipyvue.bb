SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "python39-ipyvue-1.9.2-2.1.noarch.rpm"
RPM_HASH = "21f446cb245cfe78fc8d0986371730038b8174d66a38562a5586e88127513517018a1a850e8f4422c429328e21985847cbbce1ae823c966e646bd6d6785a3b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipyvue \
python39-ipyvue \
python3dist-ipyvue"

RDEPENDS:${PN} += "python-abi \
python39-ipywidgets"

inherit rpm
