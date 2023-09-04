SUMMARY = "Systemd tools for portable services"
DESCRIPTION = "Systemd tools to manage portable services. The feature is still considered \
experimental so the package might change or vanish.  Use at own risk. \
 \
More information can be found online: \
 \
http://0pointer.net/blog/walkthrough-for-portable-services.html \
https://systemd.io/PORTABLE_SERVICES"
LICENSE = "LGPL-2.1-or-later"

PV = "253.8"

RPM_NAME = "systemd-portable-253.8-1.2.aarch64.rpm"
RPM_HASH = "853dce30a0690c94aa4f8745a2601b141508b9a5c53335942218497cbdda60ce4ebac0161cb6d7648327f1a31b23d0a5e00bf252472f1b9b2531e8b6a5a7c7f0"

RPROVIDES:${PN} += "systemd-portable"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libsystemd-shared-253.so \
systemd"

inherit rpm
