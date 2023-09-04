SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "python311-ipyvue-1.9.2-2.1.noarch.rpm"
RPM_HASH = "a0d35844c3827bf8811725d9da370f6b514976902e423155b14ff0b6e479118b13f48943dd53390e16dd4005b6cc207735b032cfd2a33b5bd101f53bcfee4422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyvue \
python3.11dist-ipyvue \
python311-ipyvue \
python3dist-ipyvue"

RDEPENDS:${PN} += "python-abi \
python311-ipywidgets"

inherit rpm
