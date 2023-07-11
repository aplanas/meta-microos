SUMMARY = "A custom ipython widget for returning mouse and keyboard events"
DESCRIPTION = "ipyevents provides a custom widget for returning mouse and keyboard \
events to Python. Use it to: \
 \
  * add keyboard shortcuts to an existing widget. \
  * react to the user clicking on an image. \
  * install callbacks on arbitrary mouse and keyboard events. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "jupyter-ipyevents-jupyterlab-2.0.1-5.5.noarch.rpm"
RPM_HASH = "0f4636a7184fc9cc2efb95606fab60dae0a9c47391b4a42fc04a0d0a44e8d0020d1e1e827f22f494b2ecdd8bc6348734ac713b9513a54f23ce4f758226afe05c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyevents-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipyevents"

inherit rpm
