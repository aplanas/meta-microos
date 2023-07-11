SUMMARY = "GNU Binutils"
DESCRIPTION = "The GNU Binutils are a collection of binary tools. \
These utilities (like 'as', 'ld', 'strip') understand Windows executables and DLLs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw64-binutils-2.39-4.5.noarch.rpm"
RPM_HASH = "b1ddadc8ce9546014f060f475060346706e53f54ac1f8ba6c89eb3e96d76f8cea77920bded47c616fec3cbb25db53101fc818c3cf205849d7576cb6715c0acda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-binutils \
mingw64-libdep.dll"

RDEPENDS:${PN} += ""

inherit rpm
