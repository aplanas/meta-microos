SUMMARY = "A simple GObject game controller library"
DESCRIPTION = "libmanette allows easy access to game controllers."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.6"

RPM_NAME = "libmanette-0_2-0-0.2.6-2.10.aarch64.rpm"
RPM_HASH = "4a8e79c23f513c16c31c41b487a1076c03dcbc2b92fe11a24bab6509434029223729808738c9d56795dc6af95b4edabd21d94736d84cbab122d50dad3377691d"

RPROVIDES:${PN} += "libmanette-0-2-0 \
libmanette-0.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0"

inherit rpm
