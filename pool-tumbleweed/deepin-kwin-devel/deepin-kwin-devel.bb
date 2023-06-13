SUMMARY = "Development tools for deepin-kwin"
DESCRIPTION = "The deepin-kwin is the window manager of the Deepin desktop environment. \
This package provides development files."
LICENSE = "GPL-3.0-or-later"

PV = "5.25.0"

RPM_NAME = "deepin-kwin-devel-5.25.0-1.2.aarch64.rpm"
RPM_HASH = "aa8e4ec6c6d827bf1b16778ac69e6df170c566360e2e1630445b02a3e05181ed15b26e2b43b650909495a5f0f919856d9c607cc46c6a8858420bce76c64755d2"

RPROVIDES:${PN} += "cmake(KWinDBusInterface) \
cmake(KWinEffects) \
deepin-kwin-devel \
deepin-kwin-devel(aarch-64)"

RDEPENDS:${PN} += "deepin-kwin"

inherit rpm
