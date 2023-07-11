SUMMARY = "File chooser widget for use in Jupyter/IPython"
DESCRIPTION = "Python file chooser widget for use in Jupyter/IPython in conjunction with ipywidgets"
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-ipyfilechooser-0.6.0-1.9.noarch.rpm"
RPM_HASH = "5eff310fb19d4ef58ffd5b20f1833387a3e43418d7c946aceee250bc3866ae96bd9eef380d6f05bec65db8364b86d1b2162976eebe9480ebe0c838c60148cafb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyfilechooser \
python3.11dist-ipyfilechooser \
python311-ipyfilechooser \
python3dist-ipyfilechooser"

RDEPENDS:${PN} += "python-abi \
python311-ipywidgets"

inherit rpm
