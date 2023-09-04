SUMMARY = "Wrapper around the LineUpjs library for multi attribute rankings"
DESCRIPTION = "LineUp is an interactive technique designed to create, visualize and explore \
rankings of items based on a set of heterogeneous attributes. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-lineup-widget-4.0.0-2.1.noarch.rpm"
RPM_HASH = "6a60f02599311442b48cf33c47c3d7f889a244f6d88529fe5e466cf07566d0aa4e9cfab0e67aa5cd559afa2b350d543980bdaa5a76bc31a77447c694a8b85e29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lineup-widget \
python310-lineup-widget \
python3dist-lineup-widget"

RDEPENDS:${PN} += "python-abi \
python310-ipywidgets \
python310-pandas"

inherit rpm
