SUMMARY = "Headers and libraries for the belcard library"
DESCRIPTION = "Belcard is a C++ library to manipulate the vCard standard format files. \
 \
This package contains header files and development libraries needed \
to develop applications using the belcard library."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.16"

RPM_NAME = "belcard-devel-5.2.16-1.3.aarch64.rpm"
RPM_HASH = "9ec2220aa868aa2e5002456e8c1c32e5f601c316515ea20b36e8a019e3164036c44c2c00249f9218d455fbea17b5fc07dbbf5e58ae26d7b568c10892c5bbf866"

RPROVIDES:${PN} += "belcard-devel \
belcard-devel(aarch-64) \
pkgconfig(belcard)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
libbctoolbox-tester.so.1()(64bit) \
libbelcard.so.1()(64bit) \
libbelcard1 \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
pkgconfig(bctoolbox) \
pkgconfig(belr)"

inherit rpm
