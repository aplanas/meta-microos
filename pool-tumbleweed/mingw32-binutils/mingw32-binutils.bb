SUMMARY = "GNU Binutils"
DESCRIPTION = "The GNU Binutils are a collection of binary tools. \
These utilities (like 'as', 'ld', 'strip') understand Windows executables and DLLs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw32-binutils-2.39-4.5.noarch.rpm"
RPM_HASH = "643bfc95ed6e513ef2dac7385daa197eb4e419fc53c01b18b51910b121c68e3693fe046e79fbe7fcddc969a7be8a4504f59747a31ec49256ca49f6a0b4e11842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-binutils \
mingw32-libdep.dll"

RDEPENDS:${PN} += ""

inherit rpm
