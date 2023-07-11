SUMMARY = "Python bindings for 0MQ"
DESCRIPTION = "PyZMQ is a lightweight and super-fast messaging library built on top of \
the ZeroMQ library (http://www.zeromq.org)."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.0.2"

RPM_NAME = "python311-pyzmq-25.0.2-1.3.aarch64.rpm"
RPM_HASH = "e1431d6ede7c18f2947a9c019cf0efae53706a7a47bd42cc5a88f1773e5aafb96757b08cefa07176b10325661de1917f58816022610542ee9e12ec9986c824b7"

RPROVIDES:${PN} += "python3-pyzmq \
python3.11dist-pyzmq \
python311-pyzmq \
python3dist-pyzmq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5 \
python-abi"

inherit rpm
