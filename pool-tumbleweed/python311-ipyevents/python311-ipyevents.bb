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

RPM_NAME = "python311-ipyevents-2.0.1-5.5.noarch.rpm"
RPM_HASH = "dfaeee8d1857c42f815a7c22971078787780e2a91daf0adf3a64b42a2ed33fc441054a4c4ef516510d6010535a8920f15d34e5ac73c647e92bf0fb2439ce0411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyevents \
python3.11dist-ipyevents \
python311-ipyevents \
python3dist-ipyevents"

RDEPENDS:${PN} += "jupyter-ipyevents \
python-abi \
python311-ipywidgets"

inherit rpm
