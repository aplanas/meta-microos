SUMMARY = "Noise profiling tools to support new cameras"
DESCRIPTION = "darktable is a virtual lighttable and darkroom for photographers: it manages \
digital negatives in a database and can show them through a zoomable \
lighttable. It also enables developing raw images and enhance them. \
 \
This package provides the noise profiling tools to add support for new cameras."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.1"

RPM_NAME = "darktable-tools-noise-4.2.1-1.3.aarch64.rpm"
RPM_HASH = "eb46ba297711b1e431118fd344adfb7a7763e8235bc26b29afd28c640fa65fd8c3dbabdefd11802bd3808769b4ae37df5997cb51a35b41c9376a1c7df340d674"

RPROVIDES:${PN} += "darktable-tools-noise darktable-tools-noise(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/convert ghostscript gnuplot ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
