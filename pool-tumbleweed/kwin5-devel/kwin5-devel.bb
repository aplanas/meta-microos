SUMMARY = "KDE Window Manager - development files"
DESCRIPTION = "KWin is the window manager of the K desktop environment. \
This package provides development files."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "5.27.6"

RPM_NAME = "kwin5-devel-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "e769bab0950819bfa1e11b1b03ad59d0d8aedb5a7dd9413871c0fa59d7023591f1eb09d35749fc573121284e573187da7f5d64695cf1eb8d91977e6a1adbe4ce"

RPROVIDES:${PN} += "cmake-KWinDBusInterface \
cmake-KWinEffects \
kwin5-devel"

RDEPENDS:${PN} += "kwin5 \
libepoxy-devel \
libkdecoration2-devel"

inherit rpm
