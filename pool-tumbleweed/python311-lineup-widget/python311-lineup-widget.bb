SUMMARY = "Wrapper around the LineUpjs library for multi attribute rankings"
DESCRIPTION = "LineUp is an interactive technique designed to create, visualize and explore \
rankings of items based on a set of heterogeneous attributes. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-lineup-widget-4.0.0-1.8.noarch.rpm"
RPM_HASH = "18cafd0df28490b8e78321249f0c195f9ba00b3d069879bcb805a4181eadb720acf1d94b6f9f1a87bd8bf50d0f03202519dd9d1d01d8ce3210ac065c27c6e9ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(lineup-widget) \
python311-lineup-widget \
python3dist(lineup-widget)"
RDEPENDS:${PN} += "python(abi) \
python311-ipywidgets \
python311-notebook \
python311-pandas"

inherit rpm
