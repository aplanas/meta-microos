SUMMARY = "Development files for fcitx5-lua"
DESCRIPTION = "This package provides development files for fcitx5-lua."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.10"

RPM_NAME = "fcitx5-lua-devel-5.0.10-1.4.aarch64.rpm"
RPM_HASH = "a096a1ed29f5ce43008f24e779ec4029f0f6078fec8564df3104cd3869ee643245832392318c60f6a358d30a9a09298d9a05a92b955986edde99be6c81dcf3c1"

RPROVIDES:${PN} += "cmake-Fcitx5ModuleLuaAddonLoader \
fcitx5-lua-devel"

RDEPENDS:${PN} += "fcitx5-lua"

inherit rpm
