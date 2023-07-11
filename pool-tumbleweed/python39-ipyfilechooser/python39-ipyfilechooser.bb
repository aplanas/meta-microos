SUMMARY = "File chooser widget for use in Jupyter/IPython"
DESCRIPTION = "Python file chooser widget for use in Jupyter/IPython in conjunction with ipywidgets"
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-ipyfilechooser-0.6.0-1.9.noarch.rpm"
RPM_HASH = "202ce62155c434518074b1f89007695b08b886b2961c9fad53baabf89f2a538287db00aa4345711e7a0dbb03ad17ff6c2cad8bcb4b67875f567bb37a6529ea77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipyfilechooser \
python39-ipyfilechooser \
python3dist-ipyfilechooser"

RDEPENDS:${PN} += "python-abi \
python39-ipywidgets"

inherit rpm
