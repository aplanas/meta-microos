SUMMARY = "Jupyter interactive widgets for Jupyter Notebook"
DESCRIPTION = "This package makes Jupyter widgets available in the classic Jupyter Notebook. \
This package provides the necessary JavaScript controls in the Jupyter \
Notebook that communicate with the widget objects in the kernel. \
 \
Install the corresponding Jupyter widgets package into your kernel, i.e., \
IPython users would install ipywidgets into their kernel."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.7"

RPM_NAME = "python311-widgetsnbextension-4.0.7-1.1.noarch.rpm"
RPM_HASH = "2c62e33c08c95e04c50aa8e6ca0b12fee31946b24bde69cad5b59bd19240cbc9bce7f966d3bb80edc8340b99c4f070830cbaeba8773efefb7a3c1cc049219e8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-widgetsnbextension \
python311-jupyter-widgetsnbextension \
python311-widgetsnbextension \
python3dist-widgetsnbextension"

RDEPENDS:${PN} += "jupyter-widgetsnbextension \
python-abi"

inherit rpm
