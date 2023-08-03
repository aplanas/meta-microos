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

RPM_NAME = "python39-ipyevents-2.0.1-5.6.noarch.rpm"
RPM_HASH = "2b77c8498afdfbb398113d968a51e5389628973131c30b0a2fea4398c492dcd83e736fccf0a317519fa8effb31cb25bfffabeda30a7a19c796c74ec376fa07ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipyevents \
python39-ipyevents \
python3dist-ipyevents"

RDEPENDS:${PN} += "jupyter-ipyevents \
python-abi \
python39-ipywidgets"

inherit rpm
