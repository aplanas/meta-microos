SUMMARY = "A Qt-based OBS library"
DESCRIPTION = "A library for interacting with the Open Build Service (OBS)."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "libqobs2-2.1.0-2.10.aarch64.rpm"
RPM_HASH = "eb7614cd649850cd2b9faae068d6a5e876918a7d31788890b49f9b9753948347bd4099f1076d6dd33a4f424587d027c123bab54877face4a27f0441e960013af"

RPROVIDES:${PN} += "libqobs.so.2 \
libqobs2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
