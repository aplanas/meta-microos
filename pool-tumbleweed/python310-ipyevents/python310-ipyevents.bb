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

RPM_NAME = "python310-ipyevents-2.0.1-5.3.noarch.rpm"
RPM_HASH = "a8517bad5581fa0e65731f0647255f0ee55fa0da824d40e8060226f5d235ac3dc5d058a6b7464269bf86db29fbf8ca2f46ba1a2e130b3849ec36a14789d92898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyevents \
python3.10dist(ipyevents) \
python310-ipyevents \
python3dist(ipyevents)"

RDEPENDS:${PN} += "jupyter-ipyevents \
python(abi) \
python310-ipywidgets"

inherit rpm
