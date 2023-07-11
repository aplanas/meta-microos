SUMMARY = "Jupyter interactive widgets for Jupyter Notebook"
DESCRIPTION = "This package makes Jupyter widgets available in the classic Jupyter Notebook. \
This package provides the necessary JavaScript controls in the Jupyter \
Notebook that communicate with the widget objects in the kernel. \
 \
Install the corresponding Jupyter widgets package into your kernel, i.e., \
IPython users would install ipywidgets into their kernel."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.7"

RPM_NAME = "python39-widgetsnbextension-4.0.7-1.2.noarch.rpm"
RPM_HASH = "c25c9fdf1a915c402cd3177e3bdf422f2220b63b56bfb6fb5cae8e50f5e0211e641a5f000ca35285ff119a11068c287d24175d0dd56320d37c9e01118bb2b334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-widgetsnbextension \
python39-jupyter-widgetsnbextension \
python39-widgetsnbextension \
python3dist-widgetsnbextension"

RDEPENDS:${PN} += "jupyter-widgetsnbextension \
python-abi"

inherit rpm
