SUMMARY = "Systemd tools for portable services"
DESCRIPTION = "Systemd tools to manage portable services. The feature is still \
considered experimental so the package might change  or vanish. \
Use at own risk. \
 \
More information can be found online: \
 \
http://0pointer.net/blog/walkthrough-for-portable-services.html \
https://systemd.io/PORTABLE_SERVICES"
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-portable-253.4-2.1.aarch64.rpm"
RPM_HASH = "4d660e30a4c1c3b05903a2071d24e633577b91faa9ca9a4448845e2c645a0c5d15b0c1a0d26951d12758ce50cc6de6ae628c9730edce39eb6e5d1ff04ceca022"

RPROVIDES:${PN} += "systemd-portable"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libsystemd-shared-253.so \
systemd"

inherit rpm
