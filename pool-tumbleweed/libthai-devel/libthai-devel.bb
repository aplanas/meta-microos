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

RPM_NAME = "libthai-devel-0.1.29-1.6.aarch64.rpm"
RPM_HASH = "329c947f84426ccd10fe5a804ffdd1088968596745f37750d804dd2e229ca003a0ac322fa1ffd703b1a34eb943c146f03199bcd756c43421b23aad797316452f"

RPROVIDES:${PN} += "libthai-devel \
pkgconfig-libthai"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libthai0 \
pkgconfig-datrie-0.2"

inherit rpm
