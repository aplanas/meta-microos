SUMMARY = "Headers and libraries for the belr library"
DESCRIPTION = "Belr parses input formatted according to a language defined by an \
ABNF grammar, such as the protocols standardised at IETF. \
 \
This package contains header files and development libraries needed \
to develop applications using the belr library."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "belr-devel-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "9f30b204edbe22b1d05307dc2e8e055c06d4f1a955591d54e7842ab35bb49faa6882fef8fe372414aafca5df75d3278e8c5eb84cdd006d1169e5f5eb9107eb83"

RPROVIDES:${PN} += "belr-devel \
cmake-belr \
pkgconfig-belr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libbctoolbox-tester.so.1 \
libbctoolbox.so.1 \
libbelr.so.1 \
libbelr1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
pkgconfig-bctoolbox"

inherit rpm
