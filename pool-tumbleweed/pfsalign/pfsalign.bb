SUMMARY = "Align image stack"
DESCRIPTION = "Align multiple exposures using homographic transformation. The command \
uses a similar feature-point based method as most panorama stitching software."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfsalign-2.2.0-3.15.aarch64.rpm"
RPM_HASH = "46be061b73d80e39e1585d17fb1fc003f9b69d4b6e8108adcebf34ebaf8923eacbb82975d90dfdf4945946d3cf55fef45092f2b81c2767f26542f59f5b09c56f"

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
