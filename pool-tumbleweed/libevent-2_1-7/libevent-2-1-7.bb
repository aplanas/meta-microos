SUMMARY = "An event notification library"
DESCRIPTION = "The libevent API provides a mechanism to execute a callback function \
when a specific event occurs on a file descriptor or after a timeout \
has been reached. Furthermore, libevent also support callbacks due to \
signals or regular timeouts. \
 \
Currently, libevent supports /dev/poll, kqueue(2), event ports, \
POSIX select(2), Windows select(), poll(2), and epoll(4). \
 \
Libevent additionally provides a sophisticated framework for buffered \
network IO, with support for sockets, filters, rate-limiting, SSL, \
zero-copy file transmission, and IOCP. Libevent includes support for \
several useful protocols, including DNS, HTTP, and a minimal RPC \
framework. \
 \
This package holds the shared libraries for libevent."
LICENSE = "BSD-3-Clause"

PV = "2.1.12"

RPM_NAME = "libevent-2_1-7-2.1.12-3.5.aarch64.rpm"
RPM_HASH = "85c85946c7ad53eb20c5c3414f19e5e3708d35205900ee790ee35ff44f67a80ccbf9d49992c5e127b42392073d757d682263f4a7bfc4c6719afff1e67a71fdba"

RPROVIDES:${PN} += "libevent \
libevent-2-1-7 \
libevent-2.1.so.7 \
libevent-core-2.1.so.7 \
libevent-extra-2.1.so.7 \
libevent-openssl-2.1.so.7 \
libevent-pthreads-2.1.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
