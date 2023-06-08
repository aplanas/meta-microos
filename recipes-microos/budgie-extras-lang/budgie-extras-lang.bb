SUMMARY = "Translations for package budgie-extras"
DESCRIPTION = "Provides translations for the 'budgie-extras' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-extras-lang-1.6.0-1.1.noarch.rpm"
RPM_HASH = "8bce6a0bedebc00df41323433b3a0c01b6d19d13aa3025d044f3d06c0f104a95c3219121da5e412ae1734fd25701779a219c65a5315b76a71cf1703eed12fa22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-extras-lang budgie-extras-lang-all locale(budgie-extras:ca) locale(budgie-extras:de_DE) locale(budgie-extras:en_GB) locale(budgie-extras:es) locale(budgie-extras:fr) locale(budgie-extras:he) locale(budgie-extras:it) locale(budgie-extras:ja) locale(budgie-extras:lt) locale(budgie-extras:oc) locale(budgie-extras:pl) locale(budgie-extras:pt_BR) locale(budgie-extras:pt_PT) locale(budgie-extras:ru) locale(budgie-extras:sq) locale(budgie-extras:tr) locale(budgie-extras:zh_CN)"
RDEPENDS:${PN} += "budgie-extras"

inherit rpm
