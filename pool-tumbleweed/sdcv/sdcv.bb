SUMMARY = "Console version of the Stardict program"
DESCRIPTION = "Console version of the Stardict program. \
It can employ all the dictionary files that belong to StarDict. \
The word sdcv stands for StarDict under Console Version."
LICENSE = "GPL-2.0-only"

PV = "0.5.4"

RPM_NAME = "sdcv-0.5.4-1.2.aarch64.rpm"
RPM_HASH = "24e711f1d9a58f0fdf1bb26e2c5095892692476873db91fefe66015cf833c59590a63d18477c88331610fb6266d8a74f61f7e276be87d1b49368d23a2a685650"

RPROVIDES:${PN} += "sdcv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libreadline.so.8 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
