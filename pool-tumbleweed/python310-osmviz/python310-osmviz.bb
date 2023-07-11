SUMMARY = "An OpenStreetMap Visualization Toolkit for Python"
DESCRIPTION = "OSMViz is a small set of Python tools for retrieving and using Mapnik \
tiles from a Slippy Map server (you may know these as OpenStreetMap \
images)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-osmviz-1.1.0-3.8.noarch.rpm"
RPM_HASH = "fb3a5a1c1e9f53eb2b04b754beafcc7cdcc0fa604421b2f7e5bdbc4eab2cf3839fb9f10d40dbf9025a6e8a0c29ea43b38bafc1b823808d343a8c95c12f268187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-osmviz \
python310-osmviz \
python3dist-osmviz"

RDEPENDS:${PN} += "python-abi \
python310-pygame"

inherit rpm
