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

RPM_NAME = "python310-ipyevents-2.0.1-5.5.noarch.rpm"
RPM_HASH = "ef3ad147c7ad5ce1b977883658fba9e1ed9a8184dbd6ed92f776f9340a799b4e72032546317c2532d017a5bf0d8b16e1d51fa53d8ec13d0c49465e4bb69bd8b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipyevents \
python310-ipyevents \
python3dist-ipyevents"

RDEPENDS:${PN} += "jupyter-ipyevents \
python-abi \
python310-ipywidgets"

inherit rpm
