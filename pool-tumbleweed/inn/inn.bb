SUMMARY = "InterNetNews"
DESCRIPTION = "Rich Salz's InterNetNews news transport system."
LICENSE = "BSD-4-Clause & GPL-2.0-or-later"

PV = "2.6.5"

RPM_NAME = "inn-2.6.5-1.9.aarch64.rpm"
RPM_HASH = "df03bb2a6ab40c8d9478e275cbb4c804bb4f5a8cac7572e85c03d58dfcbc95e175ffa6eddb5a38a9345d4085b12242a6f5204e9d8e9302741a47e8deb5b9f913"

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
