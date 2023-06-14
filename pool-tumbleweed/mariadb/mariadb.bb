SUMMARY = "Server part of MariaDB"
DESCRIPTION = "MariaDB is an open-source, multi-threaded, relational database management \
system. It's a backward compatible, drop-in replacement branch of the \
MySQL Community Server. \
 \
This package only contains the server-side programs."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.3"

RPM_NAME = "mariadb-10.11.3-1.1.aarch64.rpm"
RPM_HASH = "f32dd2b8c820156ed261b62c468a2fded69d95870c8251df5743c8b917c58c91455d6e1ac494d8599d01b6e4509ae09e8a075d031cabec096a1d307f49028083"

RPROVIDES:${PN} += "config-mariadb \
libdaemon-example.so \
mariadb \
mariadb-debug \
mariadb-debug-version \
mariadb-server \
mysql \
mysql-debug \
mysql-server"

RDEPENDS:${PN} += "/bin/bash \
/bin/hostname \
/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libJudy.so.1 \
libaio.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
liblz4.so.1 \
liblzma.so.5 \
liblzo2.so.2 \
libm.so.6 \
libodbc.so.2 \
libpam.so.0 \
libpcre2-8.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
libwrap.so.0 \
libxml2.so.2 \
libz.so.1 \
mariadb-client \
mariadb-errormessages \
perl-base \
permissions \
python3-mysqlclient \
user-mysql"

inherit rpm
