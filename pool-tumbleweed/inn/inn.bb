SUMMARY = "InterNetNews"
DESCRIPTION = "Rich Salz's InterNetNews news transport system."
LICENSE = "BSD-4-Clause & GPL-2.0-or-later"

PV = "2.6.5"

RPM_NAME = "inn-2.6.5-1.10.aarch64.rpm"
RPM_HASH = "4d2ba58f9ab07c75c031346fcd4c64e319130b2b460af5114dfc4fc837f4e2d9e93b27ac613a6720d8e5b0121391386c937646f99abeceb3b6bda6cd732e9904"

RPROVIDES:${PN} += "config-inn \
inn \
inn-pkg \
nntp-daemon \
perl-INN--Config \
perl-INN--Utils--Shlock \
perl-innreport-inn"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
group-news \
group-uucp \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libgdbm-compat.so.4 \
libpam.so.0 \
libperl.so \
libpython3.11.so.1.0 \
libssl.so.3 \
libz.so.1 \
perl \
perl-GD \
perl-MIME--Parser \
perl-MIME-tools \
permissions \
systemd \
user-news"

inherit rpm
