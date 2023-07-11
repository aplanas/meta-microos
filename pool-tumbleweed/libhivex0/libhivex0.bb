SUMMARY = "Windows Registry Hive extraction library"
DESCRIPTION = "Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "libhivex0-1.3.23-2.5.aarch64.rpm"
RPM_HASH = "0fad0aff712ce9cce0d76a7ff37a1fd14116bb1e5b697c1615d0b05c72e3256c84c8191456f0cac1d032383336a6135cb4b834942e94f0e7d5b49cbbb1b575dd"

RPROVIDES:${PN} += "libhivex.so.0 \
libhivex0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
