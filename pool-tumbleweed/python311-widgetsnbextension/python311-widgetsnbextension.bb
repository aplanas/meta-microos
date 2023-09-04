SUMMARY = "Jupyter interactive widgets for Jupyter Notebook"
DESCRIPTION = "This package makes Jupyter widgets available in the classic Jupyter Notebook. \
This package provides the necessary JavaScript controls in the Jupyter \
Notebook that communicate with the widget objects in the kernel. \
 \
Install the corresponding Jupyter widgets package into your kernel, i.e., \
IPython users would install ipywidgets into their kernel."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.8"

RPM_NAME = "python311-widgetsnbextension-4.0.8-2.1.noarch.rpm"
RPM_HASH = "6ea57576507b354e38b9c81db7f997f37363ae3c6ff109dab6d13adb3e64c27ba5ccc699abd7699262b58408262db2e39b109d811d0f19ff15e8c9b7bc951322"
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
