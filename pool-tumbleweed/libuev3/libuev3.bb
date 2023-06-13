SUMMARY = "Event loop library"
DESCRIPTION = "libuEv is an event loop in the style of libevent, libev and the Xt(3) \
event loop. It has a small feature set. \
 \
libuEv is built on top of the Linux APIs epoll, timerfd and signalfd. \
Note however, a certain amount of care is needed when dealing with \
APIs that employ signalfd."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "libuev3-2.4.0-1.7.aarch64.rpm"
RPM_HASH = "bbe6a0c4118e5e0ed89e337c126f5b3ad0c2eb36ef0a88e69ec8bb6d2b2fd7eda2e88079a29d71be2eaf9e9752a6985a7e4e1279b2ca95f28ab2c7250dc7575f"

RPROVIDES:${PN} += "libuev.so.3()(64bit) \
libuev3 \
libuev3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
