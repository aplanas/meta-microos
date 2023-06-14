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

RPM_NAME = "jupyter-ipyevents-2.0.1-5.3.noarch.rpm"
RPM_HASH = "f41c603b3775f34d29688a5d342cfca2500ab414fd533a7c17b78fe040ac9c71b97032484a10b8254abae6e3baacfabb601fc75612be781989ec67b64571b25a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyevents"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-ipyevents"

inherit rpm
