SUMMARY = "Shared Library for ZeroMQ"
DESCRIPTION = "The ZeroMQ messaging kernel is a library extending the standard \
socket interfaces with an abstraction of asynchronous message queues, \
multiple messaging patterns, message filtering (subscriptions) and \
seamless access to multiple transport protocols. \
 \
This package holds the shared library part of the ZeroMQ package."
LICENSE = "LGPL-3.0-or-later"

PV = "4.3.4"

RPM_NAME = "libzmq5-4.3.4-4.3.aarch64.rpm"
RPM_HASH = "60be53448f1e44a77662514d7499e1913619d0d319316cbe0359a932e7ea8e453ebdcbad5c91b1bf2ff013c68bc88f3b890a60aaa9efe8aa7892cdf853ff6105"

RPROVIDES:${PN} += "libzmq.so.5()(64bit) \
libzmq5 \
libzmq5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libsodium.so.23()(64bit) \
libstdc++.so.6()(64bit) \
libunwind.so.8()(64bit)"

inherit rpm
