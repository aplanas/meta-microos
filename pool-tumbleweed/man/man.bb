SUMMARY = "A Program for Displaying man Pages"
DESCRIPTION = "A program for displaying man pages on the screen or sending them to a \
printer (using groff)."
LICENSE = "GPL-2.0-or-later"

PV = "2.11.2"

RPM_NAME = "man-2.11.2-2.1.aarch64.rpm"
RPM_HASH = "d1956cbe1996b408bfd403578bc4a662e1f1d0cb5169b17ade72b72d24ad6d53d85d33ad90811bcfe009282d2a7050de3122cafa425c70b42b9e829175982190"

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
