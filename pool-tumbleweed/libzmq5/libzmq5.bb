SUMMARY = "Shared Library for ZeroMQ"
DESCRIPTION = "The ZeroMQ messaging kernel is a library extending the standard \
socket interfaces with an abstraction of asynchronous message queues, \
multiple messaging patterns, message filtering (subscriptions) and \
seamless access to multiple transport protocols. \
 \
This package holds the shared library part of the ZeroMQ package."
LICENSE = "LGPL-3.0-or-later"

PV = "4.3.4"

RPM_NAME = "libzmq5-4.3.4-4.4.aarch64.rpm"
RPM_HASH = "2c8ff4a595cf4d9bef15c832a400e68363917db6145dee12b85a63bdf1ad517eb45879970e43447cb6a6791e4e96df440bc37ae069ea4eeaec8af4fc8fb7e27b"

RPROVIDES:${PN} += "libzmq.so.5 \
libzmq5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsodium.so.23 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
