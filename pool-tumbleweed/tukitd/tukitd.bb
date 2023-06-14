SUMMARY = "D-Bus controlling service for transactional updates"
DESCRIPTION = "This package provedes the D-Bus service to access libtukit4's \
functionality to manage transactional systems."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "tukitd-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "9b72c80a73a300a36a97bccca8e384749e875ee59bc2874e0d14706ad1fe1095db417030b3d49e8af238531e53355f9b031b31b09d63eaeb73cb18db680be27f"

RPROVIDES:${PN} += "tukitd"

RDEPENDS:${PN} += "/bin/sh \
dbus-1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libtukit.so.4 \
libtukit4"

inherit rpm
