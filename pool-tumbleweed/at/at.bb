SUMMARY = "A Job Manager"
DESCRIPTION = "This program allows you to run jobs at specified times."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.5"

RPM_NAME = "at-3.2.5-2.2.aarch64.rpm"
RPM_HASH = "d0cb6b6bdec490ee1758fb3f65b704740a9f6d607dc0d5f7730ebe682d702ffd043ab19a3ca289165498a377003f79381c857e9fe6948df6ed8a1c444377683a"

RPROVIDES:${PN} += "at \
config-at \
group-at \
user-at"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6 \
libpam.so.0 \
libselinux.so.1 \
permissions \
sysuser-shadow"

inherit rpm
