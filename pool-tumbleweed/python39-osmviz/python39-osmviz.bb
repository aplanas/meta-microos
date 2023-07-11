SUMMARY = "An OpenStreetMap Visualization Toolkit for Python"
DESCRIPTION = "OSMViz is a small set of Python tools for retrieving and using Mapnik \
tiles from a Slippy Map server (you may know these as OpenStreetMap \
images)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-osmviz-1.1.0-3.8.noarch.rpm"
RPM_HASH = "bc8419db51f9d03ff12ea60c3abffb5d59ff8444da358507e8fd16799c67f648373a4e1e87eb8381376e67f68ab814bb02f518cf99fc2fd4e74c97008134aca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-osmviz \
python39-osmviz \
python3dist-osmviz"

RDEPENDS:${PN} += "python-abi \
python39-pygame"

inherit rpm
