SUMMARY = "Windows Registry Hive extraction library"
DESCRIPTION = "Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "libhivex0-1.3.23-2.3.aarch64.rpm"
RPM_HASH = "4d82795e700d8e64869e2ae808d815421c1c3ea23296521d99097911a1cc27ba6c7e7504289d92e03e6aad422931270d6487baf34db3567fcbe5d748480228cd"

RPROVIDES:${PN} += "libhivex.so.0()(64bit) \
libhivex0 \
libhivex0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
