SUMMARY = "Postfix plugin to support LMDB maps"
DESCRIPTION = "Postfix plugin to support LMDB maps. This library will be loaded \
by starting postfix if you'll access a postmap which is stored in \
lmdb."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.1"

RPM_NAME = "postfix-bdb-lmdb-3.8.1-2.1.aarch64.rpm"
RPM_HASH = "0f8c022947df2dc61bfa85c2bbfa195409d2295c505717cb41ff57850ca1346437bdb9c61bfa385a2c4738ca32b98ab16ec2205224b4a0dc34527bb2fa0aaa6a"

RPROVIDES:${PN} += "postfix-bdb-lmdb \
postfix-lmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblmdb-0.9.30.so \
postfix-bdb"

inherit rpm
