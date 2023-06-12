SUMMARY = "MPC (Musepack) input plugin for the C* Music Player"
DESCRIPTION = "This package provides MPC (Musepack) input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-mpc-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "75ddaefb5f033f6f458b483a608f5d32a788697f4ffb0d2182f95fb88ab502dc75f92b576cd3a7eaf40cac1796d1a6a095293fad9011092dced4f659f74c705d"

RPROVIDES:${PN} += "cmus-plugin-mpc \
cmus-plugin-mpc(aarch-64)"
RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmpcdec.so.5()(64bit)"

inherit rpm
