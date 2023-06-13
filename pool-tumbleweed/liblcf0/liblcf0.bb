SUMMARY = "RPG Maker 2000/2003 and EasyRPG game data library"
DESCRIPTION = "liblcf is a library to handle RPG Maker 2000/2003 and EasyRPG game data. \
It can read and write LCF and XML files."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "liblcf0-0.6.2-2.12.aarch64.rpm"
RPM_HASH = "4fd63c45169671b62841c3d848786ce6f650b3843ba4fd3c98d3528446209de7acb5d0865d09dec234e6abfdd5a644766c5d41b515c029615c521e6cb1bbfccc"

RPROVIDES:${PN} += "liblcf.so.0()(64bit) \
liblcf0 \
liblcf0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
