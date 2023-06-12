SUMMARY = "An OpenStreetMap Visualization Toolkit for Python"
DESCRIPTION = "OSMViz is a small set of Python tools for retrieving and using Mapnik \
tiles from a Slippy Map server (you may know these as OpenStreetMap \
images)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-osmviz-1.1.0-3.7.noarch.rpm"
RPM_HASH = "7dc91efd02244efa86a1e48532d4a55ac993f32b3569e56f7fb1e59c89de7c062a8b6f2a4811b041469cf80434fc7403e8b11d0a93624abd0ecf0cd191cf85f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(osmviz) \
python39-osmviz \
python3dist(osmviz)"
RDEPENDS:${PN} += "python(abi) \
python39-pygame"

inherit rpm
