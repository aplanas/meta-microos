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

RPM_NAME = "jupyter-ipyevents-2.0.1-6.1.noarch.rpm"
RPM_HASH = "a3f5cdfdb08558f7ee1e1b5e6d9f5061a9417f2b2a131b05196aa5952c210efa18d13c577228f5cfc751cc484a89a51ba8e9b869cfa8592b79a66ba0dca023fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyevents"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-ipyevents"

inherit rpm
