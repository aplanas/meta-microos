SUMMARY = "Key-based configuration system"
DESCRIPTION = "dconf is a low-level configuration system. Its main purpose is to \
provide a backend to GSettings on platforms that don't already \
have configuration storage systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40.0"

RPM_NAME = "dconf-0.40.0-3.3.aarch64.rpm"
RPM_HASH = "a17659174e81815f432846da0e66493db38c87f69b805b9c06c6831c726f48a7351b3376cb6c93a79ce866f4d7248bd62f5e6a030783933fc7603059a3ef9077"

RPROVIDES:${PN} += "dconf \
dconf(aarch-64)"

RDEPENDS:${PN} += "dbus-1 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdconf.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
