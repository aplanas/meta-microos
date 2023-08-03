SUMMARY = "Development files for the VLC media player system"
DESCRIPTION = "These development headers are required if you plan on coding against VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-devel-3.0.18-8.1.aarch64.rpm"
RPM_HASH = "feec0c0163938ecd14c36e27d636948b63a51ca0ba9777f9ff673886f4ec4e9a968f4fd3971405b6ca1e25249533f4a9c6cea034bbbac8f9ddea5ad75dcdaf5d"

RPROVIDES:${PN} += "pkgconfig-libvlc \
pkgconfig-vlc-plugin \
vlc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
vlc-jack \
vlc-noX \
vlc-vdpau"

inherit rpm
