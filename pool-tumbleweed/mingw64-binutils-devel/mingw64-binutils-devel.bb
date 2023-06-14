SUMMARY = "GNU Binutils"
DESCRIPTION = "libbfd, libiberty and libopcodes.a"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw64-binutils-devel-2.39-4.3.noarch.rpm"
RPM_HASH = "770bb7cac171d3fc9457b00bbc66a62c027025f35691f57c00f988cda79df6725423a30ceda59ee36ec0b8678a41183b5c9d9868f29dbedd444ab9a07f308e88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-binutils-devel \
mingw64-lib-bfd \
mingw64-lib-ctf \
mingw64-lib-ctf-nobfd \
mingw64-lib-iberty \
mingw64-lib-opcodes"

RDEPENDS:${PN} += ""

inherit rpm
