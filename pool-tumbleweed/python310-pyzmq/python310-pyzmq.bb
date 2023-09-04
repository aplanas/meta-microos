SUMMARY = "Python bindings for 0MQ"
DESCRIPTION = "PyZMQ is a lightweight and super-fast messaging library built on top of \
the ZeroMQ library (http://www.zeromq.org)."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.1.1"

RPM_NAME = "python310-pyzmq-25.1.1-1.1.aarch64.rpm"
RPM_HASH = "0355362dc2d79e8505641006b633c74c0b2448ded22be6f61c37ef38a1073e32d995fe119382566713adc22cfb27ea09a0cb96954f2f50d86f06ab326d9fe9ad"

RPROVIDES:${PN} += "python3.10dist-pyzmq \
python310-pyzmq \
python3dist-pyzmq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5 \
python-abi"

inherit rpm
