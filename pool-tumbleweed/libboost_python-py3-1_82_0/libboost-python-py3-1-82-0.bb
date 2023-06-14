SUMMARY = "Boost.Python runtime library"
DESCRIPTION = "This package contains the Boost.Python runtime libraries for python3 \
bindings."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_python-py3-1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "4c3b234a27eadb591b515e92d0032f1062e3c6f6aaef102c8dd37872157280d88df911f7629819a615a90d5dca5e8024368ac36109f8dc72c008059b22c4dfb5"

RPROVIDES:${PN} += "libboost-python-py3-1-82-0 \
libboost-python-py3.so.1.82.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
