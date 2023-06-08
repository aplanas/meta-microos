SUMMARY = "GNU binutils (BFD development files)"
DESCRIPTION = "This package includes header files and static libraries necessary to \
build programs which use the GNU BFD library, which is part of \
binutils."
LICENSE = "GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "binutils-devel-2.40-4.1.aarch64.rpm"
RPM_HASH = "980d8a90b3edaed7c20d66aae1179dd06fa09618378c4166f0bd776a476b1d334a0e32cceb716d38c96d5dcbc6201636c4652d8ffdc1fc5f4264020dcc0f30fd"

RPROVIDES:${PN} += "binutils-devel binutils-devel(aarch-64) binutils:/usr/include/bfd.h"
RDEPENDS:${PN} += "binutils zlib-devel"

inherit rpm
