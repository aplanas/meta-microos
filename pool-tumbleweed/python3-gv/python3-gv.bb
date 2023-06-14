SUMMARY = "Python 3 Extension for Graphviz"
DESCRIPTION = "The package contains the Python extension for the \
graphviz tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "python3-gv-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "b08fac230377a8dd7b45e22abaf21a00502976341697b36a704f28efb8d5dbe053c9acc8660af29992ea13589ae20185122310d6b9655348466ee0ffd486f95c"

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
