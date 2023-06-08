SUMMARY = "PolicyKit helper to configure cups with fine-grained privileges"
DESCRIPTION = "This package provides a PolicyKit helper to configure cups with \
fine-grained privileges. For example, it's possible to let users \
enable/disable printers without requiring a password, while still \
requiring a password for editing printer settings."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.7"

RPM_NAME = "cups-pk-helper-0.2.7-1.4.aarch64.rpm"
RPM_HASH = "f2e884a5b2a50f730cafa2f14eaca06822a6e6d6fa24da21e234b955f9b59ce9054aad1e13b6ddee3163d8da41fa1d50a26f1467564b61196b1726936c9a6199"

RPROVIDES:${PN} += "cups-pk-helper cups-pk-helper(aarch-64)"
RDEPENDS:${PN} += "cups ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcups.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libpolkit-gobject-1.so.0()(64bit)"

inherit rpm
