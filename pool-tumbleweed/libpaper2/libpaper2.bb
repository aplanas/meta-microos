SUMMARY = "This package contains the paper library"
DESCRIPTION = "This package provides the paper library"
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "libpaper2-2.1.1-1.1.aarch64.rpm"
RPM_HASH = "adb03856e82809ca77faa7d1da61435a8576cd44c444693181ee0bd669adf57c268bd15c3ff3a10720df10de6e524bf64615fec3daa423242e08e9ef44b8ad69"

RPROVIDES:${PN} += "libpaper.so.2 \
libpaper2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpaper"

inherit rpm
