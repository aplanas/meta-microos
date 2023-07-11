SUMMARY = "YaST2 - Hardware Detection Interface"
DESCRIPTION = "This package contains the hardware detection library for YaST2."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-hardware-detection-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "ed88c6b82e406d8b67aee8da7f2c9363b3adc5c3f949c861d6c4ccb2534ad211a1ea5226af6bcea56710f676d43866f8fcce479041874cf514003fa2d758a05a"

RPROVIDES:${PN} += "libpy2ag-hwprobe.so.2 \
yast2-hardware-detection"

RDEPENDS:${PN} += "hwinfo \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhd.so.23 \
libscr.so.3 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
yast2-ruby-bindings"

inherit rpm
