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

PV = "253.7"

RPM_NAME = "systemd-portable-253.7-1.2.aarch64.rpm"
RPM_HASH = "0fb7993f802f92808ea8efac9a4f79e0eed075a580cd2ddc5abeec4d720922c425210a2370aa28ccdba768f49c8db6906bd60c1335fa4a6f5436d9ee27548c5a"

RPROVIDES:${PN} += "systemd-portable"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libsystemd-shared-253.so \
systemd"

inherit rpm
