SUMMARY = "GTK3 Preview Helper for the GTK Configuration"
DESCRIPTION = "This package contains a helper application that allows previewing \
the GTK3 application style from within the application style KCM"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "5.27.6"

RPM_NAME = "kde-gtk-config5-gtk3-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "ab2999a45fb8abc633303b2a75b8e5e47a351892a2baa28265c00860dc69d338d7c720812e13ff401a348da4c9cf3e0d331123b0a7183089b0f2552a0968ed44"

RPROVIDES:${PN} += "kde-gtk-config5-gtk3"

RDEPENDS:${PN} += "kde-gtk-config5 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
