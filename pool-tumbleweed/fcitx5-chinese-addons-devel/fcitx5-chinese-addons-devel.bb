SUMMARY = "Development files for fcitx5-chinese-addons"
DESCRIPTION = "This package provides development files for fcitx5-chinese-addons."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-chinese-addons-devel-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "65849636bd29648b1fdf62ec596989b43e67e97f9d508110cee372ab4158f1c911ff2613993be409cb50607c95112542592402db68761efaae62ac4f992ac972"

RPROVIDES:${PN} += "cmake-Fcitx5ModuleCloudPinyin \
cmake-Fcitx5ModulePinyinHelper \
cmake-Fcitx5ModulePunctuation \
fcitx5-chinese-addons-devel"

RDEPENDS:${PN} += "fcitx5-chinese-addons \
fcitx5-pinyindictmanager"

inherit rpm
