SUMMARY = "Configurable GPL-licensed FTP server software"
DESCRIPTION = "ProFTPD is a configurable FTP daemon for Unix and Unix-like \
operating systems."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-1.3.7f-1.3.aarch64.rpm"
RPM_HASH = "02726f0c2c208df001505951c561706cc0c9da5198346c00fb9b25ba7ff039cdc8262b4f98d286cf7280c833d10d0a7871a32d3cdb3bf576f595906d0cb439b6"

RPROVIDES:${PN} += "config-proftpd \
proftpd"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
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
