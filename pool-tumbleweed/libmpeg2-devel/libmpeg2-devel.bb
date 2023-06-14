SUMMARY = "Development files for libmpeg2"
DESCRIPTION = "Include Files and Libraries mandatory for libmpeg2 Development"
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "libmpeg2-devel-0.5.1-3.12.aarch64.rpm"
RPM_HASH = "8162f8454a2dd26ad9576ff114f8c13c0639c9ae8981ad339978a8458f7ebb8c698e33bc72840be413c933ae7e84bd3c817e37a810c2bf761926fc7d10fd897f"

RPROVIDES:${PN} += "libmpeg2-devel \
pkgconfig-libmpeg2 \
pkgconfig-libmpeg2convert"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmpeg2-0 \
libmpeg2convert0"

inherit rpm
