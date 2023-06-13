SUMMARY = "Tools to work with ZeroMQ"
DESCRIPTION = "The ZeroMQ messaging kernel is a library extending the standard \
socket interfaces with an abstraction of asynchronous message queues, \
multiple messaging patterns, message filtering (subscriptions) and \
seamless access to multiple transport protocols. \
 \
This package contains the utilities to work with ZeroMQ library."
LICENSE = "LGPL-3.0-or-later"

PV = "4.3.4"

RPM_NAME = "zeromq-tools-4.3.4-4.3.aarch64.rpm"
RPM_HASH = "b1c1a844016236996f53dd124c9576dd26176a42085985fe0bf42edf10643ed0b5d20c70e61f1274fce084b14aa84025362e6264488ee4c724db003a8b012c2a"

RPROVIDES:${PN} += "zeromq-tools \
zeromq-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libzmq.so.5()(64bit)"

inherit rpm
