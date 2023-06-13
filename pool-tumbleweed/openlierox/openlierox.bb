SUMMARY = "A real-time, excessive clone of Worms"
DESCRIPTION = "Based on Liero gameplay, OpenLierox is an extremely addictive realtime worms \
shoot-em-up backed by an active gamers community. Dozens of levels and mods \
are available to provide endless gaming pleasure."
LICENSE = "LGPL-2.0-or-later"

PV = "0.58_rc5"

RPM_NAME = "openlierox-0.58_rc5-4.1.aarch64.rpm"
RPM_HASH = "c81e8b855aebf408a2a5ee92a6274d98b622f16348c8c4e931cda1d85aa41f30f209b947df68699cc8dc197e36edcde4211f84a9581b2bc3a3df9735b215edbf"

RPROVIDES:${PN} += "OpenLieroX \
application() \
application(openlierox.desktop) \
metainfo() \
metainfo(openlierox.appdata.xml) \
openlierox \
openlierox(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgd.so.3()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
libzip.so.5()(64bit)"

inherit rpm
