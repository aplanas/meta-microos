SUMMARY = "Cartographic projection software"
DESCRIPTION = "This package offers the commandline tools for performing respective \
forward and inverse transformation of cartographic data to or from cartesian \
data with a wide range of selectable projection functions."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "proj-9.2.0-1.3.aarch64.rpm"
RPM_HASH = "4d9ae2a0bbeb32a232a2444c19cb3a58f575cee3e643d935525d8b4d3f11a8a2ec5ef08cb398280e0e371712bd44ae7923154e4ea6af68361f461d3f02575010"

RPROVIDES:${PN} += "libproj \
proj \
proj(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libproj.so.25()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
