SUMMARY = "A robust high performance CORBA ORB for C++ and Python"
DESCRIPTION = "omniORB is a robust high performance CORBA ORB for C++ and Python. \
 \
It adheres to version 2.6 of the CORBA specification and is fully \
interoperable with other CORBA ORBs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "omniORB-4.3.0-2.8.aarch64.rpm"
RPM_HASH = "22aa01081a358acb253d67aac80ce394e1c611cdef1ea51d13d565745811afd159153b97e3242794f81393987d19c883cf1850e723dd054cc8dada8a3803a6a8"

RPROVIDES:${PN} += "omniORB"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libomniORB4.so.3 \
libomnithread.so.4 \
libstdc++.so.6 \
python-abi"

inherit rpm
