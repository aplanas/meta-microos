SUMMARY = "Front-end for mp3gain based on wxWidgets"
DESCRIPTION = "A front-end for mp3gain based on the wxWidgets toolkit."
LICENSE = "GPL-3.0-or-later"

PV = "4.0"

RPM_NAME = "wxmp3gain-4.0-1.24.aarch64.rpm"
RPM_HASH = "d07aaba84d94f68b0945619cc11e5ed75e10b7de82bcfbd815a37a87bf89d656ad16bc26941f43a8ef7a4e8f66a649beace21bd76e070fe9bf5e622f74426282"

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
