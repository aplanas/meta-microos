SUMMARY = "File chooser widget for use in Jupyter/IPython"
DESCRIPTION = "Python file chooser widget for use in Jupyter/IPython in conjunction with ipywidgets"
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-ipyfilechooser-0.6.0-1.7.noarch.rpm"
RPM_HASH = "c191262e90c1c54cdd59ddf4450372646c59683db969f8a74d929d8073caefe7a1d78abbec4e840dfbcf9f134b16672a10c939521b3a3aaa6ae04204a3008f46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipyfilechooser) \
python311-ipyfilechooser \
python3dist(ipyfilechooser)"
RDEPENDS:${PN} += "python(abi) \
python311-ipywidgets"

inherit rpm
