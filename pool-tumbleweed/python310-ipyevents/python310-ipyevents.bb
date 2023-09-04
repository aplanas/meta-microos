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

RPM_NAME = "python310-ipyevents-2.0.1-6.1.noarch.rpm"
RPM_HASH = "2e87ce62802a7d7271102cc58ff396d8a4100c00623eb4a938ad76e8563492c8b4dfb7df927a9217730dfdeef1b93f9d01764ed16f9cd3c2487f014b194821ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipyevents \
python310-ipyevents \
python3dist-ipyevents"

RDEPENDS:${PN} += "jupyter-ipyevents \
python-abi \
python310-ipywidgets"

inherit rpm
