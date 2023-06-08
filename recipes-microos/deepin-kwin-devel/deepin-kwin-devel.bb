SUMMARY = "Development tools for deepin-kwin"
DESCRIPTION = "The deepin-kwin is the window manager of the Deepin desktop environment. \
This package provides development files."
LICENSE = "GPL-3.0-or-later"

PV = "5.25.0"

RPM_NAME = "deepin-kwin-devel-5.25.0-1.1.aarch64.rpm"
RPM_HASH = "2f0a08ed197f875614fd37646088cf47a803e98c1c25213a51856e62b71ced452a1cccd532bbe9a167007b4ed63f17d79682a10a75846ddd0102b11bf546f57f"

RPROVIDES:${PN} += "cmake(KWinDBusInterface) cmake(KWinEffects) deepin-kwin-devel deepin-kwin-devel(aarch-64)"
RDEPENDS:${PN} += "deepin-kwin"

inherit rpm
