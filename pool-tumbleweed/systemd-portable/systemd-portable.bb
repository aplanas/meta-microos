SUMMARY = "Systemd tools for portable services"
DESCRIPTION = "Systemd tools to manage portable services. The feature is still considered \
experimental so the package might change or vanish.  Use at own risk. \
 \
More information can be found online: \
 \
http://0pointer.net/blog/walkthrough-for-portable-services.html \
https://systemd.io/PORTABLE_SERVICES"
LICENSE = "LGPL-2.1-or-later"

PV = "253.7"

RPM_NAME = "systemd-portable-253.7-2.1.aarch64.rpm"
RPM_HASH = "a8eadef76387d5d59d7dad32e64a05864de99cb387194c2c0be38157854387f9ba37de6ada5d540f9a580a286266a8095bbd9a6069c8d8daa041c0c34c30ea7f"

RPROVIDES:${PN} += "systemd-portable"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libsystemd-shared-253.so \
systemd"

inherit rpm
