SUMMARY = "Library to download and display gravatars"
DESCRIPTION = "This package contains the debug categories for the libgravatar library."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libgravatar-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "0c2ddaa833c619c48d422d0e522a4cb8a78f626d1f537a8e07658f767e63cfef82bf63387662bb224f7ba3b2430392b4abf634803b7c29cd3f2091f4cc16232c"

RPROVIDES:${PN} += "libgravatar"

RDEPENDS:${PN} += ""

inherit rpm
