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

RPM_NAME = "python39-tornado6-6.3.2-1.3.aarch64.rpm"
RPM_HASH = "32650f8029371d3745313d15fdea391bc8dc07429e87229c864389a19ec155424bd0f21613b9777617c20dabdc550bf1536f5fa5285239091ea04be0fceae2c0"

RPROVIDES:${PN} += "python3.9dist-tornado \
python39-tornado \
python39-tornado-impl \
python39-tornado6 \
python39-toro \
python3dist-tornado"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39"

inherit rpm
