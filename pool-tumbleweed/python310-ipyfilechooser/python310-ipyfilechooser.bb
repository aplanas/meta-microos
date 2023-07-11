SUMMARY = "File chooser widget for use in Jupyter/IPython"
DESCRIPTION = "Python file chooser widget for use in Jupyter/IPython in conjunction with ipywidgets"
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-ipyfilechooser-0.6.0-1.9.noarch.rpm"
RPM_HASH = "2ff1974bc42ce1bf4b3353e7595fff19200846920f2f696646b902e40fdf08f4d42e7f81f6a8fd5a19d6985e75fb62ca97ee88f885a3865eb60494d5b70c08f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipyfilechooser \
python310-ipyfilechooser \
python3dist-ipyfilechooser"

RDEPENDS:${PN} += "python-abi \
python310-ipywidgets"

inherit rpm
