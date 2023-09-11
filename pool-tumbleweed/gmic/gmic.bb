SUMMARY = "GREYC's Magick for Image Computing (denoise and others)"
DESCRIPTION = "G'MIC is a framework for image processing, providing \
several different user interfaces to convert/manipulate/filter/visualize \
generic image datasets, from 1d scalar signals to 3d+t sequences of \
multi-spectral volumetric images."
LICENSE = "CECILL-2.1"

PV = "3.3.0"

RPM_NAME = "gmic-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "e0a9a2891bae8c271159ad24f8de0d767cd63b8d5e2db4a2867d7c22efd4a9ef5bd3c3b113e907725b406dc8380c00309308ef0268b0e7e939fd01930ae84f92"

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
