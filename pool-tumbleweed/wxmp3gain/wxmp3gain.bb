SUMMARY = "Front-end for mp3gain based on wxWidgets"
DESCRIPTION = "A front-end for mp3gain based on the wxWidgets toolkit."
LICENSE = "GPL-3.0-or-later"

PV = "4.0"

RPM_NAME = "wxmp3gain-4.0-1.23.aarch64.rpm"
RPM_HASH = "7215077aaa4fd5ad8579c75a63791f3a4549ce7378077d741307b750bef074b3d15052a0eb3036ff55a8abafb8d95bc5abe57e0a8ab903c0cd9f481de94d60c7"

RPROVIDES:${PN} += "wxmp3gain"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-adv-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5 \
mp3gain"

inherit rpm
