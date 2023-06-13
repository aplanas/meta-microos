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

RPROVIDES:${PN} += "config(mariadb) \
libdaemon_example.so()(64bit) \
mariadb \
mariadb(aarch-64) \
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
ld-linux-aarch64.so.1()(64bit) \
libJudy.so.1()(64bit) \
libaio.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
liblz4.so.1()(64bit) \
liblzma.so.5()(64bit) \
liblzo2.so.2()(64bit) \
libm.so.6()(64bit) \
libodbc.so.2()(64bit) \
libpam.so.0()(64bit) \
libpcre2-8.so.0()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libsystemd.so.0(LIBSYSTEMD_227)(64bit) \
libwrap.so.0()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
mariadb-client \
mariadb-errormessages \
perl-base \
permissions \
python3-mysqlclient \
user(mysql)"

inherit rpm
