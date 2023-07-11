SUMMARY = "A Job Manager"
DESCRIPTION = "This program allows you to run jobs at specified times."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.5"

RPM_NAME = "at-3.2.5-2.3.aarch64.rpm"
RPM_HASH = "e940946193475973e632cf63f9e9b000df05b9c1bf5598e55be858f0bcc62b1a35da41905d161c7306186c2dc4051f271c2665fc69d0a6ee932cd692ed3633c4"

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
