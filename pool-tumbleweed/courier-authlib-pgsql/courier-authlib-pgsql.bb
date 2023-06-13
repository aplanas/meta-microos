SUMMARY = "PostgreSQL support for the Courier authentication library"
DESCRIPTION = "This package installs PostgreSQL support for the Courier authentication \
library. Install this package in order to be able to authenticate using \
PostgreSQL."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-pgsql-0.72.0-1.4.aarch64.rpm"
RPM_HASH = "c722331f4869ea43ee4c79b18c950ec3dc555d5f22040e45f9c8d848e863592fe74fd735647d4d23480b88f25b2da2b1f97c914a15d42368cc8725c5fb9b171c"

RPROVIDES:${PN} += "courier-authlib-pgsql \
courier-authlib-pgsql(aarch-64) \
libauthpgsql.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcourierauth.so.0()(64bit) \
libcourierauthcommon.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libpq.so.5()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
