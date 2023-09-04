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

RPM_NAME = "python39-ipyevents-2.0.1-6.1.noarch.rpm"
RPM_HASH = "98ad8501ab80cf9646898c7892b857b82cd78394728265cfeb2b02f5da57f5b4a56759cb8212edb2a2f625ae4e888a61dc9716d16a1d96b023ce9e6589babf22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipyevents \
python39-ipyevents \
python3dist-ipyevents"

RDEPENDS:${PN} += "jupyter-ipyevents \
python-abi \
python39-ipywidgets"

inherit rpm
