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

RPM_NAME = "python311-tornado6-6.3.2-2.1.aarch64.rpm"
RPM_HASH = "a102755f30d1648fb54940c408f6dff946f708fc5c9adfdb6add37e3d70ded970f95b8275ae95783b48778c0f0f87dbd7a159dec26636179eeaf83cbd68bfde1"

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
