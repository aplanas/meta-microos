SUMMARY = "Jupyter interactive widgets for Jupyter Notebook"
DESCRIPTION = "This package makes Jupyter widgets available in the classic Jupyter Notebook. \
This package provides the necessary JavaScript controls in the Jupyter \
Notebook that communicate with the widget objects in the kernel. \
 \
Install the corresponding Jupyter widgets package into your kernel, i.e., \
IPython users would install ipywidgets into their kernel."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.7"

RPM_NAME = "python310-widgetsnbextension-4.0.7-1.2.noarch.rpm"
RPM_HASH = "d0e9e81a51a341c4f83c6ddb6ea0be11281ef7d05504f141450cdb376a48ace5d239686d5cb12e777cabb677dd3eb5899260652aea23e86ab2795127ba92e856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-widgetsnbextension \
python310-jupyter-widgetsnbextension \
python310-widgetsnbextension \
python3dist-widgetsnbextension"

RDEPENDS:${PN} += "jupyter-widgetsnbextension \
python-abi"

inherit rpm
