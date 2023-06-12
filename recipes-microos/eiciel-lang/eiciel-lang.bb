SUMMARY = "Translations for package eiciel"
DESCRIPTION = "Provides translations for the 'eiciel' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.0.rc2"

RPM_NAME = "eiciel-lang-0.10.0.rc2-1.3.noarch.rpm"
RPM_HASH = "95492d1a4b387c7222854fec38be3b77c608c5b090b0ff8edca8498597ba677e86237c1d112954f941f1acb6c8aa2c876735872c63f9ca66b450e012d15c671e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eiciel-lang \
eiciel-lang-all \
locale(eiciel:ar) \
locale(eiciel:ca) \
locale(eiciel:cs) \
locale(eiciel:da) \
locale(eiciel:de) \
locale(eiciel:en_GB) \
locale(eiciel:en_US) \
locale(eiciel:es) \
locale(eiciel:fa) \
locale(eiciel:fr) \
locale(eiciel:hi) \
locale(eiciel:hu) \
locale(eiciel:id) \
locale(eiciel:it) \
locale(eiciel:ja) \
locale(eiciel:ko) \
locale(eiciel:nl) \
locale(eiciel:nn) \
locale(eiciel:pl) \
locale(eiciel:pt_BR) \
locale(eiciel:ru) \
locale(eiciel:sv) \
locale(eiciel:uk) \
locale(eiciel:zh_CN) \
locale(eiciel:zh_TW)"
RDEPENDS:${PN} += "eiciel"

inherit rpm
