SUMMARY = "LV2 plugins for librubberband"
DESCRIPTION = "Package rubberband-lv2 contains the rubberband LV2 plugin."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "rubberband-lv2-3.1.0-1.4.aarch64.rpm"
RPM_HASH = "c48fd495d1c85dec6ccbda04d7dd865e9a5c9c311d8e915056ce22fe4a5b1554fb2342db948b72304b05e69528cc19b5f720a23177e18e5088b5429d4e53af5a"

RPROVIDES:${PN} += "rubberband-lv2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
librubberband2 \
libstdc++.so.6"

inherit rpm
