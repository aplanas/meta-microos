SUMMARY = "Thunar Plugin Providing Integration with Archive Managers"
DESCRIPTION = "The Thunar Archive Plugin allows for creating and extracting archive files \
through the file context menus in the Thunar file manager using an archive \
manager. It provides scripting interface that can be used to adapt it to \
different archive managers."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "thunar-plugin-archive-0.5.1-1.1.aarch64.rpm"
RPM_HASH = "da2da37d7358a570b4d6d40d9513447a543bdec882f658471bc8fedfab5cb4f2d3317335d184dea372c10c233e57e9d8ca076f029bfdd9f8d06ada4691e827e1"

RPROVIDES:${PN} += "thunar-archive-plugin \
thunar-plugin-archive \
thunar-plugin-archive(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libthunarx-3.so.0()(64bit) \
thunar"

inherit rpm
