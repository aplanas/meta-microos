SUMMARY = "A custom ipython widget for returning mouse and keyboard events"
DESCRIPTION = "ipyevents provides a custom widget for returning mouse and keyboard \
events to Python. Use it to: \
 \
  * add keyboard shortcuts to an existing widget. \
  * react to the user clicking on an image. \
  * install callbacks on arbitrary mouse and keyboard events. \
 \
This package provides the tools and jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "jupyter-ipyevents-2.0.1-5.6.noarch.rpm"
RPM_HASH = "4cf4052307fc27716928e2a63d4cc314615e1071b716cb0560e2acff9104e82a54740c395888c5cac32aba450be55bce4508c1572be60caa8fb7e9af0440e96e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyevents"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-ipyevents"

inherit rpm
