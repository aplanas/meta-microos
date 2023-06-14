SUMMARY = "Servers for remote access commands (mrsh, mrlogin, mrcp)"
DESCRIPTION = "Server daemons for remote access commands (mrsh, mrlogin, mrcp)"
LICENSE = "GPL-2.0-or-later"

PV = "2.12"

RPM_NAME = "mrsh-server-2.12-13.3.aarch64.rpm"
RPM_HASH = "42e208565e6d9f6a96d00a863e7891d2b59c0cb3b50ea1196197b23c6f6c7307248a3e12b77ad6ac8922b9e944798f94afd29526bac73d42596f6a2b675390f7"

RPROVIDES:${PN} += "mrsh-server"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmunge.so.2 \
libpam-misc.so.0 \
libpam.so.0 \
mrsh \
tcpd"

inherit rpm
