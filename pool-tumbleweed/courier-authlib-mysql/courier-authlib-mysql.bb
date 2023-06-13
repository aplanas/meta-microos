SUMMARY = "MySQL support for the Courier authentication library"
DESCRIPTION = "This package installs MySQL support for the Courier authentication \
library. Install this package in order to be able to authenticate using \
MySQL."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-mysql-0.72.0-1.4.aarch64.rpm"
RPM_HASH = "32fd3cbec9081c4b2bd2103a1011b4766ff0ca32e53a71a9aef1355b6ecd90ac9f7d0fb244182a8c3172c67f9a42f0a46a5b0aae0de4d0aedb57483682deba34"

RPROVIDES:${PN} += "courier-authlib-mysql \
courier-authlib-mysql(aarch-64) \
libauthmysql.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcourierauth.so.0()(64bit) \
libcourierauthcommon.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
