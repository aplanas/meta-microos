SUMMARY = "Development files for fcitx5-chinese-addons"
DESCRIPTION = "This package provides development files for fcitx5-chinese-addons."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "fcitx5-chinese-addons-devel-5.0.17-1.1.aarch64.rpm"
RPM_HASH = "a521eefa518cc1f5174552484b24ac8cfcf49227f06dffcb5bfd28616b1e0b1635a1066bfb817c524cab623c97345c697aa8bcbecf6ef2d1ad01a6b4e6cff328"

RPROVIDES:${PN} += "cmake(Fcitx5ModuleCloudPinyin) \
cmake(Fcitx5ModulePinyinHelper) \
cmake(Fcitx5ModulePunctuation) \
fcitx5-chinese-addons-devel \
fcitx5-chinese-addons-devel(aarch-64)"

RDEPENDS:${PN} += "fcitx5-chinese-addons \
fcitx5-pinyindictmanager"

inherit rpm
