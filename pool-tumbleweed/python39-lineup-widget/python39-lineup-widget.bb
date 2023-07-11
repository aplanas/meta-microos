SUMMARY = "Wrapper around the LineUpjs library for multi attribute rankings"
DESCRIPTION = "LineUp is an interactive technique designed to create, visualize and explore \
rankings of items based on a set of heterogeneous attributes. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-lineup-widget-4.0.0-1.9.noarch.rpm"
RPM_HASH = "3cc946453c3ce274557c68ab0ff12152373ccf5d741bbb16c07195731e4ef9c87bd6e716437ab081b46cabc83e2647ae22e6ffbdf6cbef6a108d86c26182cf96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lineup-widget \
python39-lineup-widget \
python3dist-lineup-widget"

RDEPENDS:${PN} += "python-abi \
python39-ipywidgets \
python39-notebook \
python39-pandas"

inherit rpm
