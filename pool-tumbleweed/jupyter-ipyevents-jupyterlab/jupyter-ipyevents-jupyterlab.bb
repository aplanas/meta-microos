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

RPM_NAME = "jupyter-ipyevents-jupyterlab-2.0.1-5.6.noarch.rpm"
RPM_HASH = "549a0292b34afe066ca4d5590daee89b2d65c184eab250e440ca9903e706726bff9a7613a99c7aea316f67a7614096fc53ecdafc753592bfb56c2d5d97b2ddc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyevents-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipyevents"

inherit rpm
