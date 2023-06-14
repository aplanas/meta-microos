SUMMARY = "Python bindings for 0MQ"
DESCRIPTION = "PyZMQ is a lightweight and super-fast messaging library built on top of \
the ZeroMQ library (http://www.zeromq.org)."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.0.2"

RPM_NAME = "python311-pyzmq-25.0.2-1.1.aarch64.rpm"
RPM_HASH = "7e13297de75eaaaeef1748c068d180594c0fb199b4d55ce79a46ef8da53dcfe4d075a41acfc495dbf60d1b639563741a9801ac1fa98ea22726b108423b236fe1"

RPROVIDES:${PN} += "python3.11dist-pyzmq \
python311-pyzmq \
python3dist-pyzmq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5 \
python-abi"

inherit rpm
