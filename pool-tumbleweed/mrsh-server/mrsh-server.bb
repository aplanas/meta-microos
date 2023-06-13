SUMMARY = "Servers for remote access commands (mrsh, mrlogin, mrcp)"
DESCRIPTION = "Server daemons for remote access commands (mrsh, mrlogin, mrcp)"
LICENSE = "GPL-2.0-or-later"

PV = "2.12"

RPM_NAME = "mrsh-server-2.12-13.3.aarch64.rpm"
RPM_HASH = "42e208565e6d9f6a96d00a863e7891d2b59c0cb3b50ea1196197b23c6f6c7307248a3e12b77ad6ac8922b9e944798f94afd29526bac73d42596f6a2b675390f7"

RPROVIDES:${PN} += "mrsh-server \
mrsh-server(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmunge.so.2()(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpam_misc.so.0()(64bit) \
libpam_misc.so.0(LIBPAM_MISC_1.0)(64bit) \
mrsh \
tcpd"

inherit rpm
