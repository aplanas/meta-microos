SUMMARY = "GNU Binutils"
DESCRIPTION = "libbfd, libiberty and libopcodes.a"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw64-binutils-devel-2.39-4.5.noarch.rpm"
RPM_HASH = "1b08576317eff4735a57280d3e84e303582628c616d2d78127ee5e27e73f773b68962da7c1368193fff7f6fbdaf0c8820b5628cb17b84ffbd03b978542c9ff3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-binutils-devel \
mingw64-lib-bfd \
mingw64-lib-ctf \
mingw64-lib-ctf-nobfd \
mingw64-lib-iberty \
mingw64-lib-opcodes"

RDEPENDS:${PN} += ""

inherit rpm
