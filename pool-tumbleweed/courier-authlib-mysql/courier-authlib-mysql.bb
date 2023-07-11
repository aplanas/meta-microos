SUMMARY = "MySQL support for the Courier authentication library"
DESCRIPTION = "This package installs MySQL support for the Courier authentication \
library. Install this package in order to be able to authenticate using \
MySQL."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-mysql-0.72.0-1.5.aarch64.rpm"
RPM_HASH = "bb3fad3247a2d181f6f258312bae510d5b5b80679985d3ea013b2201ff2b9ae655feb57594a3bbe5049acb509a01fb2053ae5c63791e4be755ed008ce94cd523"

RPROVIDES:${PN} += "courier-authlib-mysql \
libauthmysql.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcourierauth.so.0 \
libcourierauthcommon.so.0 \
libgcc-s.so.1 \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
