SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "python311-ipyvue-1.9.2-1.2.noarch.rpm"
RPM_HASH = "da3cbe804102edc037056fc84c8790ca29f1e4810f6def0db8f65c36711c3824fe4385882a78aea9ca7deac55b6c3be762143b2a2fb26545dcc935d61f6fe316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyvue \
python3.11dist-ipyvue \
python311-ipyvue \
python3dist-ipyvue"

RDEPENDS:${PN} += "python-abi \
python311-ipywidgets"

inherit rpm
