SUMMARY = "Examples for the oneAPI Video Processing Library (oneVPL) dispatcher"
DESCRIPTION = "This package contains example applications for the oneAPI Video Processing Library (oneVPL) dispatcher."
LICENSE = "MIT"

PV = "2023.2.0"

RPM_NAME = "libvpl-samples-2023.2.0-1.1.aarch64.rpm"
RPM_HASH = "399e1f1b897f356002c8608c6634f27d406f503319f0ef131f3580f9a099e1bbfec1301370f9935ff0329949c0565c1c01da879d02b8a732d2f9f4ad150275fe"

RPROVIDES:${PN} += "libvpl-samples \
libvpl-samples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libvpl.so.2()(64bit)"

inherit rpm
