SUMMARY = "Front-end for mp3gain based on wxWidgets"
DESCRIPTION = "A front-end for mp3gain based on the wxWidgets toolkit."
LICENSE = "GPL-3.0-or-later"

PV = "4.0"

RPM_NAME = "wxmp3gain-4.0-1.23.aarch64.rpm"
RPM_HASH = "7215077aaa4fd5ad8579c75a63791f3a4549ce7378077d741307b750bef074b3d15052a0eb3036ff55a8abafb8d95bc5abe57e0a8ab903c0cd9f481de94d60c7"

RPROVIDES:${PN} += "application() \
application(wxmp3gain.desktop) \
wxmp3gain \
wxmp3gain(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.3.0.5()(64bit) \
libwx_gtk2u_adv-suse.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse.so.3.0.5()(64bit) \
mp3gain"

inherit rpm
