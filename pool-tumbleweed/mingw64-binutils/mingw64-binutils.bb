SUMMARY = "GNU Binutils"
DESCRIPTION = "The GNU Binutils are a collection of binary tools. \
These utilities (like 'as', 'ld', 'strip') understand Windows executables and DLLs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw64-binutils-2.39-4.3.noarch.rpm"
RPM_HASH = "13e75463b36de1c771658ff8316527c1b3e0277df0d343fdd003b52cefc4f462eb8c37cacfeb3e6105d9a5070c5497210d4b1214dad05215f682c2b726cf1557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64(libdep.dll) \
mingw64-binutils"

RDEPENDS:${PN} += ""

inherit rpm
