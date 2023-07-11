SUMMARY = "Development files for the Semigroups library"
DESCRIPTION = "A C++14 library containing implementations of several algorithms for \
computing finite and finitely presented semigroups, namely. \
 \
This subpackage provides the development headers for it."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "libsemigroups-devel-2.7.1-1.2.aarch64.rpm"
RPM_HASH = "af62faac0af29f6d0acd8fd8b0a0cedd136f4174845c4e4692669e10a4408bab3b68340f849d91a98e28b5d7633fd3e848e096f3fdc50b597626c3bd9a47646c"

RPROVIDES:${PN} += "libsemigroups-devel \
pkgconfig-libsemigroups"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsemigroups2 \
pkgconfig-eigen3 \
pkgconfig-fmt"

inherit rpm
