SUMMARY = "Wrapper around the LineUpjs library for multi attribute rankings"
DESCRIPTION = "LineUp is an interactive technique designed to create, visualize and explore \
rankings of items based on a set of heterogeneous attributes. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-lineup-widget-4.0.0-2.1.noarch.rpm"
RPM_HASH = "9487c106a5c8c58cd1132198f97fbc326a218b6c3f277fc235f9b1e7e0916fda57ac11a12f1ea4cdd4de3d0d0dfd87767d2171ca09d719adfc5668a79a10a702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lineup-widget \
python3.11dist-lineup-widget \
python311-lineup-widget \
python3dist-lineup-widget"

RDEPENDS:${PN} += "python-abi \
python311-ipywidgets \
python311-pandas"

inherit rpm
