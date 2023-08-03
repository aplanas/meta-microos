SUMMARY = "A Program for Displaying man Pages"
DESCRIPTION = "A program for displaying man pages on the screen or sending them to a \
printer (using groff)."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.2"

RPM_NAME = "man-2.10.2-2.1.aarch64.rpm"
RPM_HASH = "51ed85aff1d5e22c69d65edf42276acbd1c59d0973313dfeae163673f5981ab00064245b934da1a77771e3ac05016238bc2d39446392bd61d6316dec33da6a2f"

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
