SUMMARY = "Library to generate ODF documents from libwpd's and libwpg's api calls"
DESCRIPTION = "libodfgen is a general purpose library designed to generate ODF documents \
from api calls to libwpd and libwpg libraries."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.1.8"

RPM_NAME = "libodfgen-0_1-1-0.1.8-3.8.aarch64.rpm"
RPM_HASH = "b01414be30c6b263026d8ce97b5de09099db844e9af92b090ad25f6d849b87d6061be651bb0f24e5d389795555ec218cd093dc8bf8a099df4d7f4d3d9261ba69"

RPROVIDES:${PN} += "libodfgen-0-1-1 \
libodfgen-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
