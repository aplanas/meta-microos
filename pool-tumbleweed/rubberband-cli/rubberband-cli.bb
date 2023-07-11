SUMMARY = "Command line interface for librubberband"
DESCRIPTION = "Package rubberband-cli contains a command-line utility that can be used to exploit \
Rubber Band's capabilities."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "rubberband-cli-3.1.0-1.4.aarch64.rpm"
RPM_HASH = "f4f30d286042ccd4969c6b98ca5012cf8172237b6b14bec2c90cafb61db629fd3b7d89d582a547af4e13868d4597097c5386715b208f68b7855b7357903588fe"

RPROVIDES:${PN} += "rubberband-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
librubberband2 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
