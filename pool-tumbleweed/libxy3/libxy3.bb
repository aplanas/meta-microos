SUMMARY = "Library for reading x-y data from several file formats"
DESCRIPTION = "C++ library for reading files that contain x-y data from powder diffraction, \
spectroscopy or other experimental methods. The supported formats include: \
VAMAS, pdCIF, Bruker UXD and RAW, Philips UDF and RD, Rigaku DAT, \
Sietronics CPI, DBWS/DMPLOT, Koalariet XDD and others."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "libxy3-1.6-1.16.aarch64.rpm"
RPM_HASH = "bfa1fad1362530971965b21e6e7c1ade31a020225303a3d370cca8b562e4af4e02cbf37b6474059cc05e8b59b9e236e3abd3ff8609397da0321a6773d879efb0"

RPROVIDES:${PN} += "libxy.so.3 \
libxy3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
