SUMMARY = "GNOME su Library"
DESCRIPTION = "Libgnomesu is a library for providing superuser privileges to GNOME \
applications. It supports sudo, consolehelper, PAM, and su."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.7"

RPM_NAME = "libgnomesu-2.0.7-2.3.aarch64.rpm"
RPM_HASH = "1c5b900092bcb90481a9d422c0a9810be7b33b0cd4ada2727d3972f31fc61b1dbc3c8900024b49e73846a2b26430b68a632962317e4e2ac16051c8d5febd6b35"

RPROVIDES:${PN} += "libgnomesu \
libgnomesu(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnomesu.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
pam \
permissions"

inherit rpm
