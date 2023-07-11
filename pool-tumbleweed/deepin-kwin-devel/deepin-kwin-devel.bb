SUMMARY = "Development tools for deepin-kwin"
DESCRIPTION = "The deepin-kwin is the window manager of the Deepin desktop environment. \
This package provides development files."
LICENSE = "GPL-3.0-or-later"

PV = "5.25.5"

RPM_NAME = "deepin-kwin-devel-5.25.5-1.1.aarch64.rpm"
RPM_HASH = "53daf9593d19898c7501bb144883454181c54571608ea4c67c62c536d9ac9559bd9793afcf709f929e89265ce89ad7c129330f309b70be40246136ee22a72696"

RPROVIDES:${PN} += "cmake-KWinDBusInterface \
cmake-KWinEffects \
deepin-kwin-devel"

RDEPENDS:${PN} += "deepin-kwin"

inherit rpm
