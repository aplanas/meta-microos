SUMMARY = "Development files for the VLC media player system"
DESCRIPTION = "These development headers are required if you plan on coding against VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-devel-3.0.18-9.2.aarch64.rpm"
RPM_HASH = "ad480a9b414c8b02c1a90af8b15d37113222df8f559ca98c6bb15b3c18880dd80c3de3dac2b06887484b9bba2f150a3ef5904a4a76d139e10d49d857cb610e1c"

RPROVIDES:${PN} += "pkgconfig-libvlc \
pkgconfig-vlc-plugin \
vlc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
vlc-jack \
vlc-noX \
vlc-vdpau"

inherit rpm
