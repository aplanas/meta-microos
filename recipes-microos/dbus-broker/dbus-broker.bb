SUMMARY = "XDG-conforming message bus implementation"
DESCRIPTION = "dbus-broker is an implementation of a message bus as defined by the \
D-Bus specification. It has some different characteristics/features \
from classic D-Bus: \
 \
* No shared medium \
* No IPC to implement IPC \
* User-based accounting \
* Reliable messages \
* Just the bus implementation, no external communication \
* Local only, no remote transport \
* Support for SASL pipelining \
* Runtime broker control"
LICENSE = "Apache-2.0"

PV = "33"

RPM_NAME = "dbus-broker-33-1.3.aarch64.rpm"
RPM_HASH = "24a946f13d82c648d4dafc2e924e2c9c30e8c933ba6a63bf25bd80d053816af94d2337f6863d7b416fe5a7f53d957cfda1ed2e0b7a47cbfc4cb0c9b6e8c21f2a"

RPROVIDES:${PN} += "bundled(c-dvar) \
bundled(c-ini) \
bundled(c-list) \
bundled(c-rbtree) \
bundled(c-shquote) \
bundled(c-stdaux) \
bundled(c-utf8) \
dbus-broker \
dbus-broker(aarch-64) \
dbus-service"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaudit.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap-ng.so.0()(64bit) \
libexpat.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libsystemd.so.0(LIBSYSTEMD_221)(64bit) \
libsystemd.so.0(LIBSYSTEMD_237)(64bit) \
libsystemd.so.0(LIBSYSTEMD_243)(64bit)"

inherit rpm
