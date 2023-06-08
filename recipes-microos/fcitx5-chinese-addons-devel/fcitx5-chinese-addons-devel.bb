SUMMARY = "Development files for fcitx5-chinese-addons"
DESCRIPTION = "This package provides development files for fcitx5-chinese-addons."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.0.16"

RPM_NAME = "fcitx5-chinese-addons-devel-5.0.16-1.5.aarch64.rpm"
RPM_HASH = "6a04f8dc1b40d0f1be9cf9e429fe2bdfe2cb9a3e1da986e157eedaf5e88cdc71fb210d4c73c0c4ab9ecdd46b6efde637c58d44543dd955a081faa80cb0460a9b"

RPROVIDES:${PN} += "cmake(Fcitx5ModuleCloudPinyin) cmake(Fcitx5ModulePinyinHelper) cmake(Fcitx5ModulePunctuation) fcitx5-chinese-addons-devel fcitx5-chinese-addons-devel(aarch-64)"
RDEPENDS:${PN} += "fcitx5-chinese-addons fcitx5-pinyindictmanager"

inherit rpm
