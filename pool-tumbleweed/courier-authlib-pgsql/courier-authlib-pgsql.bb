SUMMARY = "PostgreSQL support for the Courier authentication library"
DESCRIPTION = "This package installs PostgreSQL support for the Courier authentication \
library. Install this package in order to be able to authenticate using \
PostgreSQL."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-pgsql-0.72.0-1.4.aarch64.rpm"
RPM_HASH = "c722331f4869ea43ee4c79b18c950ec3dc555d5f22040e45f9c8d848e863592fe74fd735647d4d23480b88f25b2da2b1f97c914a15d42368cc8725c5fb9b171c"

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
