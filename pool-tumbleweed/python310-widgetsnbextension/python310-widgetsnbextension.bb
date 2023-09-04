SUMMARY = "Jupyter interactive widgets for Jupyter Notebook"
DESCRIPTION = "This package makes Jupyter widgets available in the classic Jupyter Notebook. \
This package provides the necessary JavaScript controls in the Jupyter \
Notebook that communicate with the widget objects in the kernel. \
 \
Install the corresponding Jupyter widgets package into your kernel, i.e., \
IPython users would install ipywidgets into their kernel."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.8"

RPM_NAME = "python310-widgetsnbextension-4.0.8-2.1.noarch.rpm"
RPM_HASH = "242135bc67a9ce6624edf9c1f51d3743e63f8f8e0bbcb48369d298cf6a4bc10990081e6dd5142d6c08d4be84bfbc6831fcb021bda10dc84fcb2ff3560a12b34a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-widgetsnbextension \
python310-jupyter-widgetsnbextension \
python310-widgetsnbextension \
python3dist-widgetsnbextension"

RDEPENDS:${PN} += "jupyter-widgetsnbextension \
python-abi"

inherit rpm
