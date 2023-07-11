SUMMARY = "SQLite support for the Courier authentication library"
DESCRIPTION = "This package installs SQLite support for the Courier authentication \
library. Install this package in order to be able to authenticate using \
SQLite."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-sqlite-0.72.0-1.5.aarch64.rpm"
RPM_HASH = "48b8b76721c7647638da1cd631e78501e46d0af76adbdc9a268d3a59799b55853b0d2389c868ce7974aa7bad778816d04cfabc4df0809d53c406d339f3a9cc49"

RPROVIDES:${PN} += "courier-authlib-sqlite \
libauthsqlite.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcourierauth.so.0 \
libcourierauthcommon.so.0 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
