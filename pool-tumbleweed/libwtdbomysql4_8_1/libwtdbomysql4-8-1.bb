SUMMARY = "MySQL back-end for the Wt::Dbo ORM library"
DESCRIPTION = "This package contains the MySQL back-end for the Wt::Dbo ORM library."
LICENSE = "GPL-2.0-only"

PV = "4.8.1"

RPM_NAME = "libwtdbomysql4_8_1-4.8.1-3.8.aarch64.rpm"
RPM_HASH = "fa69bef7af0a91fd5998f916cd76a57cc5a7b6e1ef55cd601e49a41056a5ecf244e9ec3aeff64669072082ba722182e95b9ef7f7ebf7c2e996d7d0fb39f9f02a"

RPROVIDES:${PN} += "libwtdbomysql.so.4.8.1 \
libwtdbomysql4-8-1 \
wt-dbo-mysql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmariadb.so.3 \
libstdc++.so.6 \
libwtdbo.so.4.8.1"

inherit rpm
