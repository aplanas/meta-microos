SUMMARY = "An OpenStreetMap Visualization Toolkit for Python"
DESCRIPTION = "OSMViz is a small set of Python tools for retrieving and using Mapnik \
tiles from a Slippy Map server (you may know these as OpenStreetMap \
images)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-osmviz-1.1.0-3.7.noarch.rpm"
RPM_HASH = "b15e41f9b6030276801eed1d705a9f4c9f6d5c44125cda3a78ad27081b3a25b3a8bcc7cbbb65fe63253211967c69a42a11166b4cd8a69516d9746dbdbdd64d51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(osmviz) \
python311-osmviz \
python3dist(osmviz)"

RDEPENDS:${PN} += "python(abi) \
python311-pygame"

inherit rpm
