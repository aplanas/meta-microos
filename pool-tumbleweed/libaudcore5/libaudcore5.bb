SUMMARY = "Main functionality library of Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.3.1"

RPM_NAME = "libaudcore5-4.3.1-2.1.aarch64.rpm"
RPM_HASH = "9f531d1bfba3071363d4027c440e5982146292b10599721dd35e35b600b8798e8b278fb3ab51e974481d27e29510cc77a59d031ef4c666b91f170eee998ad862"

RPROVIDES:${PN} += "libaudcore \
libaudcore.so.5 \
libaudcore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
