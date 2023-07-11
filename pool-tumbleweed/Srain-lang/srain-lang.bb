SUMMARY = "Translations for package Srain"
DESCRIPTION = "Provides translations for the 'Srain' package."
LICENSE = "GPL-3.0-or-later & ISC"

PV = "1.5.0"

RPM_NAME = "Srain-lang-1.5.0-1.5.noarch.rpm"
RPM_HASH = "4545b590c44fbd4a85058ebdb7e7aac12ed552aa6bad7bdfe74b5a52454f8cd2b51972129d2c1b516a14653a1bbf7d20acdcec229d6576e02c386d4181b5e9a2"
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
