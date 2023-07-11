SUMMARY = "Python bindings for 0MQ"
DESCRIPTION = "PyZMQ is a lightweight and super-fast messaging library built on top of \
the ZeroMQ library (http://www.zeromq.org)."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.0.2"

RPM_NAME = "python310-pyzmq-25.0.2-1.3.aarch64.rpm"
RPM_HASH = "2bab04eda3ee0d893df461ddad27e0cb0618e50f4260ca9b07a018a399c8359781bd2769ec92bcf341eaea30a46c912fc9f68e66696b15693c8597919ab0d4d3"

RPROVIDES:${PN} += "python3.10dist-pyzmq \
python310-pyzmq \
python3dist-pyzmq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5 \
python-abi"

inherit rpm
