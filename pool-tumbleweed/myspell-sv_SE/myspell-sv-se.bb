SUMMARY = "MySpell sv_SE Dictionary"
DESCRIPTION = "Swedish Dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-sv_SE-20221012-1.2.noarch.rpm"
RPM_HASH = "314ad08df948c627559212eb53ba1bcbc16a66371d479b2bbb15bcc94151478bd0253eccf6e3b7d0ab97da9dbadf0fcb8e285aeab10e00c16e2cd08c8e42699a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-sv \
locale(libreoffice:sv_SE) \
locale(seamonkey-spellchecker:sv_SE) \
myspell-dictionary \
myspell-sv_SE \
myspell-swedish"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
