SUMMARY = "Wrapper around the LineUpjs library for multi attribute rankings"
DESCRIPTION = "LineUp is an interactive technique designed to create, visualize and explore \
rankings of items based on a set of heterogeneous attributes. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-lineup-widget-4.0.0-1.9.noarch.rpm"
RPM_HASH = "bd39c4bc7715ba36d1e6713286b1ff180ada052aa091b2a3857aa4adfeedb5de95a7357d8b33bd964f04671365688a988be285f7a45c6994137cfa1e979ae285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lineup-widget \
python3.11dist-lineup-widget \
python311-lineup-widget \
python3dist-lineup-widget"

RDEPENDS:${PN} += "python-abi \
python311-ipywidgets \
python311-notebook \
python311-pandas"

inherit rpm
