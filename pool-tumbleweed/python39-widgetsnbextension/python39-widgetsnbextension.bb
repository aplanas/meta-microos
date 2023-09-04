SUMMARY = "Jupyter interactive widgets for Jupyter Notebook"
DESCRIPTION = "This package makes Jupyter widgets available in the classic Jupyter Notebook. \
This package provides the necessary JavaScript controls in the Jupyter \
Notebook that communicate with the widget objects in the kernel. \
 \
Install the corresponding Jupyter widgets package into your kernel, i.e., \
IPython users would install ipywidgets into their kernel."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.8"

RPM_NAME = "python39-widgetsnbextension-4.0.8-2.1.noarch.rpm"
RPM_HASH = "cb956c1cd396f6a39f0faba0654a3af36f48afbb77e04353822ef160a1cce200c9c1c4048c7a0e87484b98889c9c0693b485cdbcaac96acdd2bd9d423f540ae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-widgetsnbextension \
python39-jupyter-widgetsnbextension \
python39-widgetsnbextension \
python3dist-widgetsnbextension"

RDEPENDS:${PN} += "jupyter-widgetsnbextension \
python-abi"

inherit rpm
