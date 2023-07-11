SUMMARY = "mISDN plugin for libcapi"
DESCRIPTION = "This package contain the CAPI 2.0 module for mISDN."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.1.0+2.0.22+git6"

RPM_NAME = "libcapi20-mod_misdn-2.1.0+2.0.22+git6-2.7.aarch64.rpm"
RPM_HASH = "1f9981c7af945719d0a10d68f627fca10425418be1bd0f544d7b142a5295d9d1c1e8927829d7b2d4aabf1a01ed5030cf63806d6918eb2d68ccda53b6fcd069d5"

RPROVIDES:${PN} += "lib-capi-mod-misdn.so.2 \
libcapi20-mod-misdn"

RDEPENDS:${PN} += "capi4linux \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcapi20.so.3"

inherit rpm
