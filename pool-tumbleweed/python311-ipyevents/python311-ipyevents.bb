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

RPM_NAME = "python311-ipyevents-2.0.1-5.6.noarch.rpm"
RPM_HASH = "99d7cdfee84857193354a1ecf5b76b6236cc6230534022d116eed3a10f33bb97ee3499e2e1c194606966eeba56ca912e30c488a736cd092b57d4558becd1f022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyevents \
python3.11dist-ipyevents \
python311-ipyevents \
python3dist-ipyevents"

RDEPENDS:${PN} += "jupyter-ipyevents \
python-abi \
python311-ipywidgets"

inherit rpm
