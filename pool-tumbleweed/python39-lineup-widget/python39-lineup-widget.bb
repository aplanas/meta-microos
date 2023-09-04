SUMMARY = "Wrapper around the LineUpjs library for multi attribute rankings"
DESCRIPTION = "LineUp is an interactive technique designed to create, visualize and explore \
rankings of items based on a set of heterogeneous attributes. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-lineup-widget-4.0.0-2.1.noarch.rpm"
RPM_HASH = "2d5756c650940e911b34adeb3f8b84fe2d0bf1d6e63d4bb7a7e1290528b3aedaa1b7166c1d43de2b7baad9cd3007117db2cf8f1cd2c81ba2990beea6d2df11df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lineup-widget \
python39-lineup-widget \
python3dist-lineup-widget"

RDEPENDS:${PN} += "python-abi \
python39-ipywidgets \
python39-pandas"

inherit rpm
