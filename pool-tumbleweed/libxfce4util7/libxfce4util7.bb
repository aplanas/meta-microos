SUMMARY = "Utility Library for the Xfce Desktop Environment"
DESCRIPTION = "libxfce4util is a general-purpose utility library with core application support \
for the Xfce Desktop Environment."
LICENSE = "LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "libxfce4util7-4.18.1-1.3.aarch64.rpm"
RPM_HASH = "1b2f1dfcafe1a0e22ae6b7ecdf5d8fc880304ca1b08814e50a2d1e8b05cdb6dc4a7b7b420d8f93dc3fc83758a3146e6342f175360ae954ad19f788c7e809adad"

RPROVIDES:${PN} += "libxfce4util \
libxfce4util.so.7()(64bit) \
libxfce4util7 \
libxfce4util7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
