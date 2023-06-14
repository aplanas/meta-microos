SUMMARY = "API library files for liblaszip"
DESCRIPTION = "API library for laszip \
This package contain only the dynamic build."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.3"

RPM_NAME = "liblaszip_api8-3.4.3-1.13.aarch64.rpm"
RPM_HASH = "d479897dcec581f9d004fb33f933c71ba1e7bf8822dd6919fe88856e8084fe847b2b2d3fb71895469a3cd9f3ce5aa56dc874701699fcc673c5d2437c9059453e"

RPROVIDES:${PN} += "liblaszip-api.so.8 \
liblaszip-api8"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
