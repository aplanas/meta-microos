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

PV = "253.5"

RPM_NAME = "systemd-portable-253.5-5.1.aarch64.rpm"
RPM_HASH = "e12975e10b847643fd328fef0327eb5777d06686b02213da3d6a8b4b169d5b67cfc274619cd65c7675bbab841e453ec6f44a5079a9e858e5a5916f140316282f"

RPROVIDES:${PN} += "systemd-portable"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libsystemd-shared-253.so \
systemd"

inherit rpm
