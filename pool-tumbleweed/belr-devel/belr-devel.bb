SUMMARY = "Headers and libraries for the belr library"
DESCRIPTION = "Belr parses input formatted according to a language defined by an \
ABNF grammar, such as the protocols standardised at IETF. \
 \
This package contains header files and development libraries needed \
to develop applications using the belr library."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.51"

RPM_NAME = "belr-devel-5.2.51-1.2.aarch64.rpm"
RPM_HASH = "247cee8fbccf75b752c71bccff9db71d8d8571ff9909838a209768619fc800ca85cf1d8b38d867f2f3edbeecb8dcdd8b5c62eff4a0af6040abac13fdaaf2d467"

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
