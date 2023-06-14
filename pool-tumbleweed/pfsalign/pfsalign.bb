SUMMARY = "Align image stack"
DESCRIPTION = "Align multiple exposures using homographic transformation. The command \
uses a similar feature-point based method as most panorama stitching software."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfsalign-2.2.0-3.14.aarch64.rpm"
RPM_HASH = "b2150cfeb296c957c11f06d1f6cc49016ff26aeed10b19edbb1fb03cb7c32cae05a392d05f9e60606225e8fe399baf8f121f579f0f21e127616c73a02a7e0e9c"

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
