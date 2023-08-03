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

RPM_NAME = "python310-ipyevents-2.0.1-5.6.noarch.rpm"
RPM_HASH = "8630d70457e7a4555db06fda4fd3ae029b2952489e7639f439932efe291fbf0a08f211e4869a807eab3a79fcf7ad9c8313d3376304d2e5e1f8739d41a3f7212c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipyevents \
python310-ipyevents \
python3dist-ipyevents"

RDEPENDS:${PN} += "jupyter-ipyevents \
python-abi \
python310-ipywidgets"

inherit rpm
