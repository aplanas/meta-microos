SUMMARY = "GObject-based library providing commonly used data structures"
DESCRIPTION = "Libgee is a collection library providing GObject-based interfaces and \
classes for commonly used data structures."
LICENSE = "LGPL-2.1+"

PV = "0.6.6"

RPM_NAME = "libgee2-0.6.6-5.28.aarch64.rpm"
RPM_HASH = "f836af4743370872095c731bab68e993c96bf084fd9ccd06ee540b407b1344f18ddeb63dd85575ab651a0a7f75790fdef40951529bcc936a953dcd1dda8ef174"

RPROVIDES:${PN} += "libgee.so.2()(64bit) \
libgee2 \
libgee2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
