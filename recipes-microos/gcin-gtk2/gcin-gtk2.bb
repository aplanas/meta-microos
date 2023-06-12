SUMMARY = "Gcin gtk2 immodule"
DESCRIPTION = "gcin gtk2 immodule, support gtk2-based applications"
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "gcin-gtk2-2.9.0-4.16.aarch64.rpm"
RPM_HASH = "dd30614f440a3e1a40e12b3aa5214009874f5bbd4004ddfa35d092088a0ff594b0bdfca10db6b5ae2ff3de954b0df08360cecac2168dd4770a6e8546a1a8472b"

RPROVIDES:${PN} += "gcin-gtk2 \
gcin-gtk2(aarch-64) \
gcin-gtk2-immodule"
RDEPENDS:${PN} += "/bin/sh \
gcin \
gtk2-tools \
libc.so.6(GLIBC_2.17)(64bit) \
libgcin-im-client.so.1()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
