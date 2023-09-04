SUMMARY = "Align image stack"
DESCRIPTION = "Align multiple exposures using homographic transformation. The command \
uses a similar feature-point based method as most panorama stitching software."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfsalign-2.2.0-3.16.aarch64.rpm"
RPM_HASH = "a790707426e0d44be3e40f422ab5680b82de8fcf9b24c136ee70bf6c3c1ab66be45e11a633b97c6d3d02c2f34fbd2160754fdea4348a8c8a72b4018ef2bd76bc"

RPROVIDES:${PN} += "pfsalign"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.407 \
libopencv-core.so.407 \
libopencv-features2d.so.407 \
libopencv-highgui.so.407 \
libopencv-imgproc.so.407 \
libpfs.so.2 \
libstdc++.so.6"

inherit rpm
