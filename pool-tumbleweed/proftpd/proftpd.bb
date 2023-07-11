SUMMARY = "Configurable GPL-licensed FTP server software"
DESCRIPTION = "ProFTPD is a configurable FTP daemon for Unix and Unix-like \
operating systems."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-1.3.7f-1.4.aarch64.rpm"
RPM_HASH = "138b244ff56a4f13c5d66a1fc472bd8a0034474b7651bf44b6d0b93eb10f28b20e368e79fe560e7d0ce8875d265e3f5dd4b6b389a50faf158eb307a93fb820a5"

RPROVIDES:${PN} += "config-proftpd \
proftpd"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
group-ftp \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libhiredis.so.1.1.0 \
libmemcached.so.11 \
libmemcachedutil.so.2 \
libncursesw.so.6 \
libpam.so.0 \
libpcre.so.1 \
libpcreposix.so.0 \
libsodium.so.23 \
libssl.so.3 \
libtinfo.so.6 \
libz.so.1 \
logrotate \
user-ftp"

inherit rpm
