SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "python311-ipyvue-1.9.2-1.1.noarch.rpm"
RPM_HASH = "7cc9d31b5d1407cf062006ec9598054ab36c6f68e73d244917335b63626a43aee0a89e706b0f27799bf37c00a9bb5868af73820fb9363a862b2d39df763f1525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyvue \
python3.11dist-ipyvue \
python311-ipyvue \
python3dist-ipyvue"

RDEPENDS:${PN} += "python-abi \
python311-ipywidgets"

inherit rpm
