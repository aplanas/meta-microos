SUMMARY = "InterNetNews"
DESCRIPTION = "Rich Salz's InterNetNews news transport system."
LICENSE = "BSD-4-Clause & GPL-2.0-or-later"

PV = "2.6.5"

RPM_NAME = "inn-2.6.5-1.6.aarch64.rpm"
RPM_HASH = "cfff9db5b9b20fa739ff5ee964aec032768289de8d7271aca0ddc7059da6a5bb81bb19bdf0bdecc969730f55badb4cf64a413f7ad1ce54a54ea2d18dd7d2309b"

RPROVIDES:${PN} += "config-inn \
inn \
inn-pkg \
nntp-daemon \
perl-INN--Config \
perl-INN--Utils--Shlock \
perl-innreport-inn"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
group-news \
group-uucp \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libgdbm-compat.so.4 \
libpam.so.0 \
libperl.so \
libpython3.10.so.1.0 \
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
