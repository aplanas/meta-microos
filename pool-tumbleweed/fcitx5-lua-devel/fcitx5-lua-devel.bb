SUMMARY = "Development files for fcitx5-lua"
DESCRIPTION = "This package provides development files for fcitx5-lua."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.10"

RPM_NAME = "fcitx5-lua-devel-5.0.10-1.3.aarch64.rpm"
RPM_HASH = "830fdd22392e97c3d7f927ac4aa00c4e8e766779832a7f3393a71ac3dcf83a36308499de66daa227310c0225db8d55e31f788379fdaad58703beca4b487dc2f2"

RPROVIDES:${PN} += "cmake-Fcitx5ModuleLuaAddonLoader \
fcitx5-lua-devel"

RDEPENDS:${PN} += "fcitx5-lua"

inherit rpm
