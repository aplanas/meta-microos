SUMMARY = "Python module to draw object reference graphs with graphviz"
DESCRIPTION = "objgraph is a module for visual exploration of Python object graphs. \
 \
graphviz is needed if pretty graphs are desired. \
xdot can be used for interactive use."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "python310-objgraph-3.5.0-2.2.noarch.rpm"
RPM_HASH = "2d8740d1e370e832896a7eee055b11920913daee7374fa6c7523a008dae25072975e2d3a2c4027e4ca0b314ef08168215d4576a26d47e9398553f9a25f79bbdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-objgraph \
python310-objgraph \
python3dist-objgraph"

RDEPENDS:${PN} += "graphviz-gd \
graphviz-gnome \
python-abi \
python310-graphviz"

inherit rpm
