SUMMARY = "Translations for package psmisc"
DESCRIPTION = "Provides translations for the 'psmisc' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.6"

RPM_NAME = "psmisc-lang-23.6-3.3.noarch.rpm"
RPM_HASH = "f3be4aa70d6297d09bb7b4c81f3598d445ef148657d30639397331ab2129da0015e2800d230c9610d197aa177fc7af9c314e647468b9fbf263a277b1d88c0580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(psmisc:bg) \
locale(psmisc:ca) \
locale(psmisc:cs) \
locale(psmisc:da) \
locale(psmisc:de) \
locale(psmisc:el) \
locale(psmisc:eo) \
locale(psmisc:es) \
locale(psmisc:eu) \
locale(psmisc:fi) \
locale(psmisc:fr) \
locale(psmisc:hr) \
locale(psmisc:hu) \
locale(psmisc:id) \
locale(psmisc:it) \
locale(psmisc:ja) \
locale(psmisc:nb) \
locale(psmisc:nl) \
locale(psmisc:pl) \
locale(psmisc:pt) \
locale(psmisc:pt_BR) \
locale(psmisc:ro) \
locale(psmisc:ru) \
locale(psmisc:sr) \
locale(psmisc:sv) \
locale(psmisc:uk) \
locale(psmisc:vi) \
locale(psmisc:zh_CN) \
locale(psmisc:zh_TW) \
psmisc-lang \
psmisc-lang-all"

RDEPENDS:${PN} += "psmisc"

inherit rpm
