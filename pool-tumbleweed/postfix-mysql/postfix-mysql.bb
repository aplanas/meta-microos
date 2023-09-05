SUMMARY = "Postfix plugin to support MySQL maps"
DESCRIPTION = "Postfix plugin to support MySQL maps. This library will be loaded by \
starting postfix if you'll access a postmap which is stored in mysql."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.1"

RPM_NAME = "postfix-mysql-3.8.1-2.1.aarch64.rpm"
RPM_HASH = "4bf2724fc8e835e43689f204c49e3ba44b3be630f38ca66b2d1cfaa5a104af9621f80b95dfe7acdcc2079b1f1e9eb53d4d685ae894108715d2634292783055b2"

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
