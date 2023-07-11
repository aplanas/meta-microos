SUMMARY = "Boost.Python.NumPy runtime library"
DESCRIPTION = "This package contains the Boost.Python.NumPy runtime libraries for python3 \
bindings."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_numpy-py3-1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "15c75369777f98a69ec7bba064b7fe73db4f1a94ffa67916edc7479870b6acc53add8d44b54717b0048078a58689f3d2869ba1a75788ea0173e769b467070e7c"

RPROVIDES:${PN} += "libboost-numpy-py3-1-82-0 \
libboost-numpy-py3.so.1.82.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
