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

RPM_NAME = "python311-ipyevents-2.0.1-6.1.noarch.rpm"
RPM_HASH = "10970ef2c125b8128c8782d56afb08eda3b123dd479d64917a06122f90339ecc2205fd374c10b1da25909857d688eb59b099024b94f7dfbbd5c772d4845d5cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyevents \
python3.11dist-ipyevents \
python311-ipyevents \
python3dist-ipyevents"

RDEPENDS:${PN} += "jupyter-ipyevents \
python-abi \
python311-ipywidgets"

inherit rpm
