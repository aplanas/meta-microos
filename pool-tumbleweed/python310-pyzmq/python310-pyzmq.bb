SUMMARY = "Python bindings for 0MQ"
DESCRIPTION = "PyZMQ is a lightweight and super-fast messaging library built on top of \
the ZeroMQ library (http://www.zeromq.org)."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.0.2"

RPM_NAME = "python310-pyzmq-25.0.2-1.1.aarch64.rpm"
RPM_HASH = "35b5b069b6c8b3a61dc610ab33d7889b3449dbfd97042d49e012d061942fe45f0f2aa679e514c357bcf98cb4bc4f93193d15986507eac8c9951c4e2dd98722d0"

RPROVIDES:${PN} += "python3-pyzmq \
python3.10dist(pyzmq) \
python310-pyzmq \
python310-pyzmq(aarch-64) \
python3dist(pyzmq)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libzmq.so.5()(64bit) \
python(abi)"

inherit rpm
