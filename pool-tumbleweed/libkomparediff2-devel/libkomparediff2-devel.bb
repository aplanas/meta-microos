SUMMARY = "Development package for libkomparediff2"
DESCRIPTION = "Development package for libkomparediff2."
LICENSE = "(GPL-2.0-or-later & LGPL-2.0-or-later) & BSD-2-Clause"

PV = "23.04.3"

RPM_NAME = "libkomparediff2-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "31435cff8c8db58731c2dda49264746b2e674974dd1f8ffa6f4fa56d69fb7e19fc0339ab1a73d339c086e035886971b5548df6b1fa9623f9364a3b2b731419b5"

RPROVIDES:${PN} += "cmake-LibKompareDiff2 \
libkomparediff2-devel \
libkomparediff2-kf5-devel"

RDEPENDS:${PN} += "libkomparediff2-5"

inherit rpm
