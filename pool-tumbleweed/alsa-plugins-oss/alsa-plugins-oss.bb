SUMMARY = "Plug-Ins for ALSA Library to Access OSS Devices"
DESCRIPTION = "This package contains I/O and control plugins to access OSS devices \
for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-oss-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "9bcf68fc9499dfd388929c63fa6fba7e5df44cd94454677b3d19ea3a22d19e2f370862e88427a0b9520a60d27bbe74a525d81f3df5429a807f33a001102cdb24"

RPROVIDES:${PN} += "alsa-plugins-oss \
libasound-module-ctl-oss.so \
libasound-module-pcm-oss.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
