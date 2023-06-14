SUMMARY = "Python bindings for the omniORB CORBA implementation"
DESCRIPTION = "omniORB is a robust high performance CORBA ORB for C++ and Python."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "omniORBpy-4.3.0-1.8.aarch64.rpm"
RPM_HASH = "7f0f7c13fa126c51a0c844f8acb8d068add903e14d4e558e2eed1ed852f6bc7dad22418e0fa7c8fcb9f655bf2d064104fbec67cf2f9f11282e3ac10d96d6dc04"

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
