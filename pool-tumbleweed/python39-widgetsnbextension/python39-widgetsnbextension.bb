SUMMARY = "Jupyter interactive widgets for Jupyter Notebook"
DESCRIPTION = "This package makes Jupyter widgets available in the classic Jupyter Notebook. \
This package provides the necessary JavaScript controls in the Jupyter \
Notebook that communicate with the widget objects in the kernel. \
 \
Install the corresponding Jupyter widgets package into your kernel, i.e., \
IPython users would install ipywidgets into their kernel."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.7"

RPM_NAME = "python39-widgetsnbextension-4.0.7-1.1.noarch.rpm"
RPM_HASH = "a6dcfcff028e1c3ea8eb82c25e65221fb8243a729362579ac1a6668d41a1f99b12cb4f261c888a0c94e8066cfd6f5396c2433e025169ab3d7b6bec5d95076b82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(widgetsnbextension) \
python39-jupyter_widgetsnbextension \
python39-widgetsnbextension \
python3dist(widgetsnbextension)"

RDEPENDS:${PN} += "jupyter-widgetsnbextension \
python(abi)"

inherit rpm
