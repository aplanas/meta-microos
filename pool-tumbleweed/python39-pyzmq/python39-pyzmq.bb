SUMMARY = "Python bindings for 0MQ"
DESCRIPTION = "PyZMQ is a lightweight and super-fast messaging library built on top of \
the ZeroMQ library (http://www.zeromq.org)."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.1.1"

RPM_NAME = "python39-pyzmq-25.1.1-1.1.aarch64.rpm"
RPM_HASH = "af2fa281480a51a903b58b5b8f91431adeaa8e615590fe2edf602f82bedda3f0af5ddf240d57596c18afc4c3fed8bbb4d0de2b1af2a827cf63a194c31e443af2"

RPROVIDES:${PN} += "python3.9dist-pyzmq \
python39-pyzmq \
python3dist-pyzmq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5 \
python-abi"

inherit rpm
