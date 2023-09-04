SUMMARY = "Python bindings for 0MQ"
DESCRIPTION = "PyZMQ is a lightweight and super-fast messaging library built on top of \
the ZeroMQ library (http://www.zeromq.org)."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.1.1"

RPM_NAME = "python311-pyzmq-25.1.1-1.1.aarch64.rpm"
RPM_HASH = "63e969fa44019645232676503c8b310c18c88d0577d904b9029064657d50e791a97e239129a796a90591db299b545b0556477736378fa93757b791f2894eb237"

RPROVIDES:${PN} += "python3-pyzmq \
python3.11dist-pyzmq \
python311-pyzmq \
python3dist-pyzmq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5 \
python-abi"

inherit rpm
