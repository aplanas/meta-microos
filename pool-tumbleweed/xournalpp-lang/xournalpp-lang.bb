SUMMARY = "Translations for package xournalpp"
DESCRIPTION = "Provides translations for the 'xournalpp' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.3"

RPM_NAME = "xournalpp-lang-1.1.3-2.1.noarch.rpm"
RPM_HASH = "ba98933cad48100999e0628d315926191ddc13c7cb79f982f5abdcacfa2276e1a371c41aebb278c8e5af7cd8c2907590cef90c25e3dd71dd78023fa66489ff12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xournalpp:ar) \
locale(xournalpp:ca) \
locale(xournalpp:cs) \
locale(xournalpp:da) \
locale(xournalpp:de) \
locale(xournalpp:el) \
locale(xournalpp:es) \
locale(xournalpp:eu) \
locale(xournalpp:fi) \
locale(xournalpp:fr) \
locale(xournalpp:gl) \
locale(xournalpp:he) \
locale(xournalpp:hi) \
locale(xournalpp:hu) \
locale(xournalpp:id) \
locale(xournalpp:it) \
locale(xournalpp:ja) \
locale(xournalpp:ko) \
locale(xournalpp:nl) \
locale(xournalpp:pl) \
locale(xournalpp:pt_BR) \
locale(xournalpp:pt_PT) \
locale(xournalpp:ro) \
locale(xournalpp:ru) \
locale(xournalpp:sv) \
locale(xournalpp:th) \
locale(xournalpp:tr) \
locale(xournalpp:vi) \
locale(xournalpp:zh) \
locale(xournalpp:zh_HK) \
locale(xournalpp:zh_TW) \
xournalpp-lang \
xournalpp-lang-all"
RDEPENDS:${PN} += "xournalpp"

inherit rpm
