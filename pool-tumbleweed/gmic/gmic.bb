SUMMARY = "GREYC's Magick for Image Computing (denoise and others)"
DESCRIPTION = "G'MIC is a framework for image processing, providing \
several different user interfaces to convert/manipulate/filter/visualize \
generic image datasets, from 1d scalar signals to 3d+t sequences of \
multi-spectral volumetric images."
LICENSE = "CECILL-2.1"

PV = "3.2.5"

RPM_NAME = "gmic-3.2.5-1.1.aarch64.rpm"
RPM_HASH = "2ff53f091a877f2f1479146adbdc701ddb7ee28957833a98f99631e75794cc9647369c9772beaa9947e3c6497b3786b5618cef2d2810e9dd8ec1212fb2bbeba5"

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
