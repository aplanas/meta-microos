SUMMARY = "KDE Window Manager - development files"
DESCRIPTION = "KWin is the window manager of the K desktop environment. \
This package provides development files."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "5.27.7"

RPM_NAME = "kwin5-devel-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "a634e280a12e46614c11af237eb8be8c0a6f97b7e2edd55ef524b1ca56648cf35d4bd1cb1c0117973120136ff281cb0ea6bd6d54a55b454eee6eb5188faf5b96"

RPROVIDES:${PN} += "cmake-KWinDBusInterface \
cmake-KWinEffects \
kwin5-devel"

RDEPENDS:${PN} += "kwin5 \
libepoxy-devel \
libkdecoration2-devel"

inherit rpm
