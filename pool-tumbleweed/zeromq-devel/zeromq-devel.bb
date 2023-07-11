SUMMARY = "Development files for ZeroMQ"
DESCRIPTION = "The ZeroMQ messaging kernel is a library extending the standard \
socket interfaces with an abstraction of asynchronous message queues, \
multiple messaging patterns, message filtering (subscriptions) and \
seamless access to multiple transport protocols. \
 \
This package holds the development files for ZeroMQ."
LICENSE = "LGPL-3.0-or-later"

PV = "4.3.4"

RPM_NAME = "zeromq-devel-4.3.4-4.4.aarch64.rpm"
RPM_HASH = "47bde29fd92a28ab617994753e971b3d31cfc6d66cbda9a094749d5a353fa67d9de8fee864b88397ddbbf1026c18c454c8b2322ebad2566cea5d3fc323e45339"

RPROVIDES:${PN} += "libzmq-devel \
pkgconfig-libzmq \
zeromq-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzmq5 \
pkgconfig-libsodium \
pkgconfig-libunwind"

inherit rpm
