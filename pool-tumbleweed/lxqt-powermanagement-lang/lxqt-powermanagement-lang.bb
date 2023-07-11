SUMMARY = "Translations for package lxqt-powermanagement"
DESCRIPTION = "Provides translations for the 'lxqt-powermanagement' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-powermanagement-lang-1.3.0-1.4.noarch.rpm"
RPM_HASH = "5f09ba9f1a75c8fd707ac3d4141e561a58249d536be39e9b12119d8fde4cec76852cc53c6ec2d353d67327c884412d31efce1ef2577fdac1be86f38a67971da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-powermanagement-lang \
lxqt-powermanagement-lang-all"

RDEPENDS:${PN} += "lxqt-powermanagement"

inherit rpm
