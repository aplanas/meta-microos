SUMMARY = "A Program for Displaying man Pages"
DESCRIPTION = "A program for displaying man pages on the screen or sending them to a \
printer (using groff)."
LICENSE = "GPL-2.0-or-later"

PV = "2.11.2"

RPM_NAME = "man-2.11.2-1.1.aarch64.rpm"
RPM_HASH = "a8e0b1013ae8bf059a839efefee1bb9127ed3a9ec2b309a2d0784fcf20f20244e4893e9fb207a67146c4acd3cfbb00b557fd0050bf74f357ee4157043a653111"

RPROVIDES:${PN} += "config-man \
libman-2.11.2.so \
libmandb-2.11.2.so \
man \
man-db"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
fillup \
glibc-locale-base \
groff \
group-man \
ld-linux-aarch64.so.1 \
less \
libalternatives.so.1 \
libc.so.6 \
libgdbm.so.6 \
libpipeline.so.1 \
libz.so.1 \
libzio.so.1 \
systemd \
user-man"

inherit rpm
