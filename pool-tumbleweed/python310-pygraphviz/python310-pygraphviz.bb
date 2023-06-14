SUMMARY = "Python interface to Graphviz"
DESCRIPTION = "A Python wrapper for the Graphviz Agraph data structure. \
PyGraphviz can be used to create and draw networks and graphs with Graphviz."
LICENSE = "BSD-3-Clause"

PV = "1.10"

RPM_NAME = "python310-pygraphviz-1.10-1.3.aarch64.rpm"
RPM_HASH = "78b709fa853abecab7034d2928fee02ac4bfd434ad3a66516d0a155e3963228ac63e4f1e181381bf0d4ce5b9660dbb55860e2589706764e9dd1d429a3275e30a"

RPROVIDES:${PN} += "python3-pygraphviz \
python3.10dist-pygraphviz \
python310-pygraphviz \
python3dist-pygraphviz"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.6 \
libgvc.so.6 \
python-abi"

inherit rpm
