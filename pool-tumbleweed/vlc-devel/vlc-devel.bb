SUMMARY = "Development files for the VLC media player system"
DESCRIPTION = "These development headers are required if you plan on coding against VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-devel-3.0.18-7.3.aarch64.rpm"
RPM_HASH = "ac3dd91eb1a7e0f9ca9f7664a17edb7874a2392d5cf9978d2c62f67822b0c2c1f68667abe926fce771545abc43b04ddc2a61ff5e1e03dd09778ea2079651aa66"

RPROVIDES:${PN} += "pkgconfig-libvlc \
pkgconfig-vlc-plugin \
vlc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
vlc-jack \
vlc-noX \
vlc-vdpau"

inherit rpm
