SUMMARY = "GREYC's Magick for Image Computing (denoise and others)"
DESCRIPTION = "G'MIC is a framework for image processing, providing \
several different user interfaces to convert/manipulate/filter/visualize \
generic image datasets, from 1d scalar signals to 3d+t sequences of \
multi-spectral volumetric images."
LICENSE = "CECILL-2.1"

PV = "3.2.6"

RPM_NAME = "gmic-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "3293e68eb9129fc940bb2ad8c9b2db7978608285ef86f978ab6f3c34690a8ef0aea26e0423409861213999bda9a38a74e0b8ca3db2b6b3ccb20242367acd7b82"

RPROVIDES:${PN} += "gmic"

RDEPENDS:${PN} += "gmic-data \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libfftw3-threads.so.3 \
libgcc-s.so.1 \
libgmic.so.3 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
