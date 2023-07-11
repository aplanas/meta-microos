SUMMARY = "An OpenStreetMap Visualization Toolkit for Python"
DESCRIPTION = "OSMViz is a small set of Python tools for retrieving and using Mapnik \
tiles from a Slippy Map server (you may know these as OpenStreetMap \
images)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-osmviz-1.1.0-3.8.noarch.rpm"
RPM_HASH = "d7612f6ed2cd0a9c0d342dfc4fe7586764321d95ee87831f3d53aa9732525843a7e6bf776e1e4dbb910c51dc9d98b64f5b6e35882c4bf4329028a7a34d44eb73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-osmviz \
python3.11dist-osmviz \
python311-osmviz \
python3dist-osmviz"

RDEPENDS:${PN} += "python-abi \
python311-pygame"

inherit rpm
