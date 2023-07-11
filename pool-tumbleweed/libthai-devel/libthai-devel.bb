SUMMARY = "Development files for the Thai language support library"
DESCRIPTION = "LibThai is a set of Thai language support routines to aid \
incorporation of Thai language support into applications. It includes \
important Thai-specific functions, such as word breaking, input and \
output methods, and basic character and string support. \
 \
This package contains headers and libraries required for developing \
software using libthai."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.29"

RPM_NAME = "libthai-devel-0.1.29-1.7.aarch64.rpm"
RPM_HASH = "ab53f94d5a34d5e6b0a4df02bc92fa694e5218e6a3596c9cd73a251f0556e57f3023bca4b7dd84fba436eaa9e95ce5a6cd6589d01fa1257ffd4848b67b07c2bb"

RPROVIDES:${PN} += "libthai-devel \
pkgconfig-libthai"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libthai0 \
pkgconfig-datrie-0.2"

inherit rpm
