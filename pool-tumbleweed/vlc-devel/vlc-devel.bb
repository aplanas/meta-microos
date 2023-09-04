SUMMARY = "Development files for the VLC media player system"
DESCRIPTION = "These development headers are required if you plan on coding against VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-devel-3.0.18-9.1.aarch64.rpm"
RPM_HASH = "029a8cf27cb10d8e20ac1f301b325df0de4ad631d236d18c3ac32e0366110c84a1c858907b717517b9fcd4e0dd2706ca6059a43d46c16fb90ff71f47a0ff8ac7"

RPROVIDES:${PN} += "pkgconfig-libvlc \
pkgconfig-vlc-plugin \
vlc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
vlc-jack \
vlc-noX \
vlc-vdpau"

inherit rpm
