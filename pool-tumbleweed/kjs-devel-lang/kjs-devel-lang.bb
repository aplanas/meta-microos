SUMMARY = "Translations for package kjs-devel"
DESCRIPTION = "Provides translations for the 'kjs-devel' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kjs-devel-lang-5.107.0-1.1.noarch.rpm"
RPM_HASH = "da85199d5e1c001b2ff9fb798eb2fe9c8adb48bea212f74f07a5611c05cb226c005233225917215adf240b883e42ef9562900465b75f3ddfa2925fa100219aff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kjs-devel-lang \
kjs-devel-lang-all"

RDEPENDS:${PN} += "kjs-devel"

inherit rpm
