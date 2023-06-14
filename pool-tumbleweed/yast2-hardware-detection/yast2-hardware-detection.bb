SUMMARY = "YaST2 - Hardware Detection Interface"
DESCRIPTION = "This package contains the hardware detection library for YaST2."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-hardware-detection-4.6.0-1.2.aarch64.rpm"
RPM_HASH = "b6fc6bf47ae1f7bc78692b9bd79e337f91f256de2167f323ebb9624fb3d198bbd7a24733acedc88daba79198ec188a4c090c100428f9f86f4656ddce3ea526c2"

RPROVIDES:${PN} += "libpy2ag-hwprobe.so.2 \
yast2-hardware-detection"

RDEPENDS:${PN} += "hwinfo \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhd.so.22 \
libscr.so.3 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
yast2-ruby-bindings"

inherit rpm
