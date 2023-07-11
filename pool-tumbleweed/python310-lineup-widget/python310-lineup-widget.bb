SUMMARY = "Wrapper around the LineUpjs library for multi attribute rankings"
DESCRIPTION = "LineUp is an interactive technique designed to create, visualize and explore \
rankings of items based on a set of heterogeneous attributes. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-lineup-widget-4.0.0-1.9.noarch.rpm"
RPM_HASH = "3e8f2629ea662c03aa81014e07f767a2d1e056a737bfe9c726fbf0909e1fc0ea00defa5572085926033a739b5bcb38e20e023742a2f82bfdf898855198311d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lineup-widget \
python310-lineup-widget \
python3dist-lineup-widget"

RDEPENDS:${PN} += "python-abi \
python310-ipywidgets \
python310-notebook \
python310-pandas"

inherit rpm
