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

RPM_NAME = "jupyter-ipyevents-2.0.1-5.5.noarch.rpm"
RPM_HASH = "ef209b3da4b383a546941b8f3fb57c177d0940673dc2b897f0b89e7a7ea170cfefe90614f1de6b747e3f89357ba019fac791de771a23a02281243bb3709aa2e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyevents"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-ipyevents"

inherit rpm
