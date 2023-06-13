SUMMARY = "GTK3 Preview Helper for the GTK Configuration"
DESCRIPTION = "This package contains a helper application that allows previewing \
the GTK3 application style from within the application style KCM"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "kde-gtk-config5-gtk3-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "ed6eda1959722d2f6e714328efd54dc7a9990de9e001b3db07581d753d271efa2e8b0e2fd70cb885bbeb3a0de81098fd5a5e60f11a74ae5e0ebccaa76448deff"

RPROVIDES:${PN} += "kde-gtk-config5-gtk3 \
kde-gtk-config5-gtk3(aarch-64)"

RDEPENDS:${PN} += "kde-gtk-config5 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
