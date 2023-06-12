SUMMARY = "Frontend to Manage Connections to Remote Filesystems"
DESCRIPTION = "Gigolo is a frontend to manage connections to remote filesystems using \
GIO/GVFS. It allows connecting/mounting remote filesystems and manage"
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "gigolo-0.5.2-1.11.aarch64.rpm"
RPM_HASH = "127ef79b7557a6173871c48c7c98417e38746890135745aea7b276df73b39c4eb121fb6c4e644276e65ee74094c921196afddc2721264cb56da099f2da0a8df7"

RPROVIDES:${PN} += "application() \
application(gigolo.desktop) \
gigolo \
gigolo(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
xdg-utils"

inherit rpm
