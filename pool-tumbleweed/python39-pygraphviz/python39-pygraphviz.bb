SUMMARY = "Python interface to Graphviz"
DESCRIPTION = "A Python wrapper for the Graphviz Agraph data structure. \
PyGraphviz can be used to create and draw networks and graphs with Graphviz."
LICENSE = "BSD-3-Clause"

PV = "1.11"

RPM_NAME = "python39-pygraphviz-1.11-1.1.aarch64.rpm"
RPM_HASH = "04cbd28bad6253f89e1dc77b9354f8594985108a09a1d820295dd3e0a66a2ac9e1cb0d4a531e124151993953f7fc7916cb366bcfd5c7839f1ce947d71fdf8a85"

RPROVIDES:${PN} += "python3.9dist-pygraphviz \
python39-pygraphviz \
python3dist-pygraphviz"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.6 \
libgvc.so.6 \
python-abi"

inherit rpm
