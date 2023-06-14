SUMMARY = "A Program for Displaying man Pages"
DESCRIPTION = "A program for displaying man pages on the screen or sending them to a \
printer (using groff)."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.2"

RPM_NAME = "man-2.10.2-1.4.aarch64.rpm"
RPM_HASH = "d835a1cd8a8635ac51ac0463b36fc5c9f729bb37643a19fed7d91db00f5091a3e3ac7813766eb4c98ee9ad9080b9f19ddbffcfd43e0b8816dea9cabbbf54c316"

RPROVIDES:${PN} += "config-man \
libman-2.10.2.so \
libmandb-2.10.2.so \
man \
man-db"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
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
