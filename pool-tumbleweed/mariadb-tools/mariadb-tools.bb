SUMMARY = "MariaDB tools"
DESCRIPTION = "A set of scripts for administering a MariaDB or developing \
applications with MariaDB."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "11.0.2"

RPM_NAME = "mariadb-tools-11.0.2-1.1.aarch64.rpm"
RPM_HASH = "5c7b01546486b42f0beb018e3461ba686f6bb5e113062cf7b53ca0cd768903a811cfce9412405eadc4c164a8d45a88af2daa4e9e9bbac31a03ddff996fb01d09"

RPROVIDES:${PN} += "mariadb-tools \
mysql-/usr/bin/mysqlhotcopy \
mysql-client-/usr/bin/perror \
mysql-tools"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libedit.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libncurses.so.6 \
libpcre2-8.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1 \
perl-DBD-mysql"

inherit rpm
