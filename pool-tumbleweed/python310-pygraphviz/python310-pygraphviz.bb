SUMMARY = "Python interface to Graphviz"
DESCRIPTION = "A Python wrapper for the Graphviz Agraph data structure. \
PyGraphviz can be used to create and draw networks and graphs with Graphviz."
LICENSE = "BSD-3-Clause"

PV = "1.11"

RPM_NAME = "python310-pygraphviz-1.11-1.1.aarch64.rpm"
RPM_HASH = "8b77f6d6e853fd42741f0c8daecaa248148cc9195a118237029ec0f586992968a8eb77861d983a19a8fc4a6cc5c486952891ce303e030a86418b9c0568c8b7ee"

RPROVIDES:${PN} += "python3.10dist-pygraphviz \
python310-pygraphviz \
python3dist-pygraphviz"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.6 \
libgvc.so.6 \
python-abi"

inherit rpm
