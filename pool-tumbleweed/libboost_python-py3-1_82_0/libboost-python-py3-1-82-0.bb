SUMMARY = "Boost.Python runtime library"
DESCRIPTION = "This package contains the Boost.Python runtime libraries for python3 \
bindings."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_python-py3-1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "ccc345568da63e03ebbb6c2312d89521b3ee04cb1d0df773a5fdf1156380e78c3926f9a242fab0393a84c5b58936043e33abed60a2db9c04f9f858fafa1653c5"

RPROVIDES:${PN} += "libboost-python-py3-1-82-0 \
libboost-python-py3.so.1.82.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
