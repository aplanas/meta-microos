SUMMARY = "Libao output plugin for the C* Music Player"
DESCRIPTION = "This package provides libao output support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-libao-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "11a1fee6c0036e79988938114587dde08003b7f504c499e81f038e28229b989b3fdab04cdfec5ae4d4e7e12025ea561ef278d6760729942984d8b45f703c48bb"

RPROVIDES:${PN} += "cmus-plugin-libao"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libao.so.4 \
libc.so.6"

inherit rpm
