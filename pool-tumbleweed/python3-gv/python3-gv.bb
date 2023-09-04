SUMMARY = "Python 3 Extension for Graphviz"
DESCRIPTION = "The package contains the Python extension for the \
graphviz tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "python3-gv-2.49.3-6.9.aarch64.rpm"
RPM_HASH = "0588e155e946ab7ecb53af9c9822d2222be5a53558b82a18dfd63cae68bc78418d5305d4d51126db766a944c5301d4016737519241fc41e09fb2f3198888690b"

RPROVIDES:${PN} += "libgv-python3.so \
python3-gv"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.6 \
libgcc-s.so.1 \
libgvc.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
