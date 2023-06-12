SUMMARY = "Python interface to Graphviz"
DESCRIPTION = "A Python wrapper for the Graphviz Agraph data structure. \
PyGraphviz can be used to create and draw networks and graphs with Graphviz."
LICENSE = "BSD-3-Clause"

PV = "1.10"

RPM_NAME = "python311-pygraphviz-1.10-1.3.aarch64.rpm"
RPM_HASH = "fc2d5735aa17506c49193051966489eedd9696c484a961e5cee87b07081bc2257d64070a7b9137ddfa3578e660a04e97353ba18f143f9eeff596b1a8c7e86c87"

RPROVIDES:${PN} += "python3.11dist(pygraphviz) \
python311-pygraphviz \
python311-pygraphviz(aarch-64) \
python3dist(pygraphviz)"
RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcgraph.so.6()(64bit) \
libgvc.so.6()(64bit) \
python(abi)"

inherit rpm
