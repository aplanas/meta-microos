SUMMARY = "A custom ipython widget for returning mouse and keyboard events"
DESCRIPTION = "ipyevents provides a custom widget for returning mouse and keyboard \
events to Python. Use it to: \
 \
  * add keyboard shortcuts to an existing widget. \
  * react to the user clicking on an image. \
  * install callbacks on arbitrary mouse and keyboard events. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python39-ipyevents-2.0.1-5.5.noarch.rpm"
RPM_HASH = "f21f8d1942dca7021cb14ab6abf101e349f80af23cacd01706c800c6d15b7418054a1b2bd14402508efb3337d3ab080b783556fd75d105ae7ffd487bf5323d52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipyevents \
python39-ipyevents \
python3dist-ipyevents"

RDEPENDS:${PN} += "jupyter-ipyevents \
python-abi \
python39-ipywidgets"

inherit rpm
