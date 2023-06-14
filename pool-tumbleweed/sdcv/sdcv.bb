SUMMARY = "Console version of the Stardict program"
DESCRIPTION = "Console version of the Stardict program. \
It can employ all the dictionary files that belong to StarDict. \
The word sdcv stands for StarDict under Console Version."
LICENSE = "GPL-2.0-only"

PV = "0.5.4"

RPM_NAME = "sdcv-0.5.4-1.1.aarch64.rpm"
RPM_HASH = "caece3a059a0494060cb2b2698f3610510366fbce00e5f309551acda3774a71ccb755f2747a84791cfa87de34965a5b21dc419f560b2256377c8fb8165eac684"

RPROVIDES:${PN} += "sdcv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libreadline.so.8 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
