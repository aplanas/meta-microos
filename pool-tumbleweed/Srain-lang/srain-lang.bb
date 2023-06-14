SUMMARY = "Translations for package Srain"
DESCRIPTION = "Provides translations for the 'Srain' package."
LICENSE = "GPL-3.0-or-later & ISC"

PV = "1.5.0"

RPM_NAME = "Srain-lang-1.5.0-1.4.noarch.rpm"
RPM_HASH = "339ff7269678afc7027c0f2a17211adf6a05266e9dfcd7c1e6204e729c121bf7932ee3ae8ce97bb9509ac1146454df43eff86f117fe68b65e864378d75e90fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Srain-lang \
Srain-lang-all \
locale-Srain-fr \
locale-Srain-nl \
locale-Srain-ru \
locale-Srain-uk \
locale-Srain-zh-CN"

RDEPENDS:${PN} += "Srain"

inherit rpm
