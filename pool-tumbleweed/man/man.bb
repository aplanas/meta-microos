SUMMARY = "A Program for Displaying man Pages"
DESCRIPTION = "A program for displaying man pages on the screen or sending them to a \
printer (using groff)."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.2"

RPM_NAME = "man-2.10.2-1.5.aarch64.rpm"
RPM_HASH = "fd01bb0f78be7e1fe6ca1041575db6f8b5ab78cdd10879cf1ee428e619daad33a51f12a05ce00e1e1886e4366f093c5eff723bd2a52bc2e6160c77846105b095"

RPROVIDES:${PN} += "config-man \
libman-2.10.2.so \
libmandb-2.10.2.so \
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
