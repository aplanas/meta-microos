SUMMARY = "Jupyter interactive widgets for Jupyter Notebook"
DESCRIPTION = "This package makes Jupyter widgets available in the classic Jupyter Notebook. \
This package provides the necessary JavaScript controls in the Jupyter \
Notebook that communicate with the widget objects in the kernel. \
 \
Install the corresponding Jupyter widgets package into your kernel, i.e., \
IPython users would install ipywidgets into their kernel."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.7"

RPM_NAME = "python311-widgetsnbextension-4.0.7-1.2.noarch.rpm"
RPM_HASH = "5746ab7fd6b3e5f4e807ba497215f6b3bdf640a2bb478678fa203e184453b4000473d80a2f779a05693963820bb026168b989abffae90541fd4caba3725ed885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-widgetsnbextension \
python3-widgetsnbextension \
python3.11dist-widgetsnbextension \
python311-jupyter-widgetsnbextension \
python311-widgetsnbextension \
python3dist-widgetsnbextension"

RDEPENDS:${PN} += "jupyter-widgetsnbextension \
python-abi"

inherit rpm
