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

RPM_NAME = "jupyter-ipyevents-jupyterlab-2.0.1-6.1.noarch.rpm"
RPM_HASH = "55288b49bc527c5ffa9007038ee265622f612d11175b6746eefe000b1b3a140fd7ae3f0698773efef0b48f046985c7e477a4f5916290589dd4952c4917c8a196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyevents-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipyevents"

inherit rpm
