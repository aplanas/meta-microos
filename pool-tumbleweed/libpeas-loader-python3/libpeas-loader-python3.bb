SUMMARY = "Python3 runtime loader for libpeas"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility. \
 \
This package contains the python3 loader."
LICENSE = "LGPL-2.1-or-later"

PV = "1.36.0"

RPM_NAME = "libpeas-loader-python3-1.36.0-1.1.aarch64.rpm"
RPM_HASH = "750b19c1e2364b13bc9c6bbf8fda06c3fc8d5ffecc927e96f6d49327481fbc93929212c7265bebd55ba9fabd0b7806de1f00bb112057971e75e8cbae19b21e84"

RPROVIDES:${PN} += "libpeas-loader-python3 \
libpeas-loader-python3(aarch-64) \
libpython3loader.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
libpython3.10.so.1.0()(64bit) \
typelib(GLib) \
typelib(GObject)"

inherit rpm
