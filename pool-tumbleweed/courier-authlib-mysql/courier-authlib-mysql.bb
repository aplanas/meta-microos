SUMMARY = "MySQL support for the Courier authentication library"
DESCRIPTION = "This package installs MySQL support for the Courier authentication \
library. Install this package in order to be able to authenticate using \
MySQL."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-mysql-0.72.0-1.4.aarch64.rpm"
RPM_HASH = "32fd3cbec9081c4b2bd2103a1011b4766ff0ca32e53a71a9aef1355b6ecd90ac9f7d0fb244182a8c3172c67f9a42f0a46a5b0aae0de4d0aedb57483682deba34"

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
