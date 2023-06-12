SUMMARY = "Postfix plugin to support MySQL maps"
DESCRIPTION = "Postfix plugin to support MySQL maps. This library will be loaded by \
starting postfix if you'll access a postmap which is stored in mysql."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.0"

RPM_NAME = "postfix-mysql-3.8.0-2.2.aarch64.rpm"
RPM_HASH = "c1d865f2675613aca56010084383b0607ce1fbcdaeba4db750393fe6444814ad5156d9c36dd5d9644cf7fe721e3e00b8d616595b147347c749b14f1726995967"

RPROVIDES:${PN} += "config(postfix-mysql) \
group(vmail) \
postfix-mysql \
postfix-mysql(aarch-64) \
user(vmail)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
postfix \
sysuser-shadow"

inherit rpm
