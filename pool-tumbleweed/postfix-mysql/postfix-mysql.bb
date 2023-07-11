SUMMARY = "Postfix plugin to support MySQL maps"
DESCRIPTION = "Postfix plugin to support MySQL maps. This library will be loaded by \
starting postfix if you'll access a postmap which is stored in mysql."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.1"

RPM_NAME = "postfix-mysql-3.8.1-1.1.aarch64.rpm"
RPM_HASH = "a8af33470057ca95997e950217ab37b680fa73428ed3a79ab1917a82b18c7a3148c2a83a8e82dd23d84d8fc4fb62be5a5c32c34e850c143ddbed6d2c03d23f3f"

RPROVIDES:${PN} += "config-postfix-mysql \
group-vmail \
postfix-mysql \
user-vmail"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
libc.so.6 \
libmariadb.so.3 \
postfix \
sysuser-shadow"

inherit rpm
