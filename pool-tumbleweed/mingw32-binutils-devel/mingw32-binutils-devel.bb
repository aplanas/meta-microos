SUMMARY = "GNU Binutils"
DESCRIPTION = "libbfd, libiberty and libopcodes.a"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw32-binutils-devel-2.39-4.5.noarch.rpm"
RPM_HASH = "c882b3fa03e50aa6631884d2d6a49a1d828a1a5b9901d095fa27b5eaa94987cd3046feb820e08320bdad70a88621cb09bb1af3c08f86f0d9af07c796f15da125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-binutils-devel \
mingw32-lib-bfd \
mingw32-lib-ctf \
mingw32-lib-ctf-nobfd \
mingw32-lib-iberty \
mingw32-lib-opcodes"

RDEPENDS:${PN} += ""

inherit rpm
