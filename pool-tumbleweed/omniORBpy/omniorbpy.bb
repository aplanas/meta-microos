SUMMARY = "Python bindings for the omniORB CORBA implementation"
DESCRIPTION = "omniORB is a robust high performance CORBA ORB for C++ and Python."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "omniORBpy-4.3.0-1.10.aarch64.rpm"
RPM_HASH = "54b707dd2620463b021b33b20f87180307fb31593ef5446f92b4621beb7822b32e69a01042ec921220ef2de4b86f0b300eb2d9fd7cd57df1b0ab34b8671155a8"

RPROVIDES:${PN} += "omniORBpy"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libomniCodeSets4.so.3 \
libomniConnectionMgmt4.so.3 \
libomniORB4.so.3 \
libomniZIOP4.so.3 \
libomnithread.so.4 \
libstdc++.so.6 \
python-abi"

inherit rpm
