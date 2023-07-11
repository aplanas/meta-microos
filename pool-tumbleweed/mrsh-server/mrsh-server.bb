SUMMARY = "Servers for remote access commands (mrsh, mrlogin, mrcp)"
DESCRIPTION = "Server daemons for remote access commands (mrsh, mrlogin, mrcp)"
LICENSE = "GPL-2.0-or-later"

PV = "2.12"

RPM_NAME = "mrsh-server-2.12-13.4.aarch64.rpm"
RPM_HASH = "d8c7fb23f71151a26d8a2aef1540cd45f81c3079b2a8de1164d50927e1ea7edf954b5fe5579e988c8b007a64ef7a871f5beac23664c0d8f82eaafee081bdbbef"

RPROVIDES:${PN} += "mrsh-server"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmunge.so.2 \
libpam-misc.so.0 \
libpam.so.0 \
mrsh \
tcpd"

inherit rpm
