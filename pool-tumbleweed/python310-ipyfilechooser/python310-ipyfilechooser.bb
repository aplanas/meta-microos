SUMMARY = "File chooser widget for use in Jupyter/IPython"
DESCRIPTION = "Python file chooser widget for use in Jupyter/IPython in conjunction with ipywidgets"
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-ipyfilechooser-0.6.0-1.7.noarch.rpm"
RPM_HASH = "6291551008fc4cea5934d3cde6cae2e518884de1a4bdef5bbff5e10fd1fbc62af1875e9f0ef6b3c5f21c4bf2b2dab6166e089e4f2d29dcc68b861a2f11e138dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyfilechooser \
python3.10dist-ipyfilechooser \
python310-ipyfilechooser \
python3dist-ipyfilechooser"

RDEPENDS:${PN} += "python-abi \
python310-ipywidgets"

inherit rpm
