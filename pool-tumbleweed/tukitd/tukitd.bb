SUMMARY = "D-Bus controlling service for transactional updates"
DESCRIPTION = "This package provedes the D-Bus service to access libtukit4's \
functionality to manage transactional systems."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "tukitd-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "9b72c80a73a300a36a97bccca8e384749e875ee59bc2874e0d14706ad1fe1095db417030b3d49e8af238531e53355f9b031b31b09d63eaeb73cb18db680be27f"

RPROVIDES:${PN} += "tukitd \
tukitd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
dbus-1 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_221)(64bit) \
libsystemd.so.0(LIBSYSTEMD_222)(64bit) \
libsystemd.so.0(LIBSYSTEMD_234)(64bit) \
libsystemd.so.0(LIBSYSTEMD_237)(64bit) \
libsystemd.so.0(LIBSYSTEMD_243)(64bit) \
libtukit.so.4()(64bit) \
libtukit4"

inherit rpm
