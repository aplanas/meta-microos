SUMMARY = "Open source version of scalable, non-blocking web server that power FriendFeed"
DESCRIPTION = "Tornado is an open source version of the scalable, non-blocking web server and \
tools that power FriendFeed. The FriendFeed application is written using a web \
framework that looks a bit like web.py or Google's webapp, but with additional \
tools and optimizations to take advantage of the underlying non-blocking \
infrastructure. \
 \
The framework is distinct from most mainstream web server frameworks (and \
certainly most Python frameworks) because it is non-blocking and reasonably \
fast. Because it is non-blocking and uses epoll, it can handle thousands of \
simultaneous standing connections, which means it is ideal for real-time web \
services. We built the web server specifically to handle FriendFeed's real-time \
features — every active user of FriendFeed maintains an open connection to the \
FriendFeed servers. (For more information on scaling servers to support \
thousands of clients, see The C10K problem.)"
LICENSE = "Apache-2.0"

PV = "6.3.2"

RPM_NAME = "python311-tornado6-6.3.2-1.3.aarch64.rpm"
RPM_HASH = "1b8ed61c21219f186968a0021ed822c368c3d85c5f9a425510ff93b1c2cd69eb0010dc08e0e17f6d79ace1cf683381d9bf012fb53f56898ff96df445da6f5e15"

RPROVIDES:${PN} += "python3-tornado \
python3-tornado-impl \
python3-tornado6 \
python3-toro \
python3.11dist-tornado \
python311-tornado \
python311-tornado-impl \
python311-tornado6 \
python311-toro \
python3dist-tornado"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311"

inherit rpm
