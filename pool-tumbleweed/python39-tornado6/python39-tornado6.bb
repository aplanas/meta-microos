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

RPM_NAME = "python39-tornado6-6.3.2-2.1.aarch64.rpm"
RPM_HASH = "0c55ad1244640aa1e68ea2b3995f45bfc5756b6557dd691da972fef126db8f0015a5f630f94c2354411ea6e58012c5f6b68d08bd9bf0ef1c44d761051205d527"

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
