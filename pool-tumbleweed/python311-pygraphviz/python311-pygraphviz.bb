SUMMARY = "Python interface to Graphviz"
DESCRIPTION = "A Python wrapper for the Graphviz Agraph data structure. \
PyGraphviz can be used to create and draw networks and graphs with Graphviz."
LICENSE = "BSD-3-Clause"

PV = "1.11"

RPM_NAME = "python311-pygraphviz-1.11-1.1.aarch64.rpm"
RPM_HASH = "7634d94cf838301abd15a4648061ca1383e2cc56eb5c7cc5e134bdd3a19348780cade962ad5ab536df819060d053082038581af3cae83a4ec5951244db7e53c7"

RPROVIDES:${PN} += "python3-pygraphviz \
python3.11dist-pygraphviz \
python311-pygraphviz \
python3dist-pygraphviz"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.6 \
libgvc.so.6 \
python-abi"

inherit rpm
