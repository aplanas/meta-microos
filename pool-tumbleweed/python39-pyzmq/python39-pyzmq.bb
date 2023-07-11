SUMMARY = "Python bindings for 0MQ"
DESCRIPTION = "PyZMQ is a lightweight and super-fast messaging library built on top of \
the ZeroMQ library (http://www.zeromq.org)."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.0.2"

RPM_NAME = "python39-pyzmq-25.0.2-1.3.aarch64.rpm"
RPM_HASH = "6e534078afbdcb0819a377eac7030423f627cf5aaffbf3cd20ee0dd2710c391193e0314fef68e71fe873adae3ab6c8f707a97710244f906a51e0da01fadc6254"

RPROVIDES:${PN} += "python3.9dist-pyzmq \
python39-pyzmq \
python3dist-pyzmq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5 \
python-abi"

inherit rpm
