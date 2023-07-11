SUMMARY = "Jack plugin for xine"
DESCRIPTION = "xine sound output plugin for the jack soundserver \
 \
 \
 \
Authors: \
-------- \
    Guenter Bartsch <guenter@users.sourceforge.net>"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "1.2.13"

RPM_NAME = "libxine2-jack-1.2.13-2.3.aarch64.rpm"
RPM_HASH = "ea28ef6dc7eff7366185eb308af38d2fe6efa41453d4137860b96e87c7085289baacce2d72e7d8d63b7dd5e57c1e7a729214ba484e9d04b63b9daf2e22747906"

RPROVIDES:${PN} += "libxine2-jack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0 \
libxine.so.2 \
libxine2"

inherit rpm
