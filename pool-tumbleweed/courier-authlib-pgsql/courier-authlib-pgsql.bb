SUMMARY = "PostgreSQL support for the Courier authentication library"
DESCRIPTION = "This package installs PostgreSQL support for the Courier authentication \
library. Install this package in order to be able to authenticate using \
PostgreSQL."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-pgsql-0.72.0-1.5.aarch64.rpm"
RPM_HASH = "58ad5a23b293969a8e2756f47f2ea2268500d8695c3ecc13d8cb336fbf328f7b2ce9433acb888e1039e87ef0bafac9aab2be5e648e4a188ed640b21417cd0911"

RPROVIDES:${PN} += "courier-authlib-pgsql \
libauthpgsql.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcourierauth.so.0 \
libcourierauthcommon.so.0 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
