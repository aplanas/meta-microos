SUMMARY = "Daemon to restore SELinux contexts"
DESCRIPTION = "Daemon that watches for file creation and then sets the default SELinux file context"
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "restorecond-3.5-1.3.aarch64.rpm"
RPM_HASH = "4f1bf9e78973a53f420df38dba2e9e0eaf88082e31c44b1f2a8aaaadea53880a155cc4c4554006ec4573f302c25373ebee0bd8d1a4e5da2c5ddd52499bec3dd0"

RPROVIDES:${PN} += "config-restorecond \
restorecond"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libselinux.so.1 \
libselinux1 \
selinux-tools"

inherit rpm
