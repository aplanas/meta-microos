SUMMARY = "Languages for Mutt"
DESCRIPTION = "Provides translations to the package mutt."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.10"

RPM_NAME = "mutt-lang-2.2.10-2.1.noarch.rpm"
RPM_HASH = "ace4af93f1db5ef705f7fb7baf420e09c60809f5ed35966d2058e379e7da17023486e0a9b058da94cb57bc6ec9a163b40bb468efa4d9561ebd87bb20cf597a7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mutt:bg) \
locale(mutt:ca) \
locale(mutt:cs) \
locale(mutt:da) \
locale(mutt:de) \
locale(mutt:el) \
locale(mutt:eo) \
locale(mutt:es) \
locale(mutt:et) \
locale(mutt:eu) \
locale(mutt:fi) \
locale(mutt:fr) \
locale(mutt:ga) \
locale(mutt:gl) \
locale(mutt:hu) \
locale(mutt:id) \
locale(mutt:it) \
locale(mutt:ja) \
locale(mutt:ko) \
locale(mutt:lt) \
locale(mutt:nl) \
locale(mutt:pl) \
locale(mutt:pt_BR) \
locale(mutt:ru) \
locale(mutt:sk) \
locale(mutt:sv) \
locale(mutt:tr) \
locale(mutt:uk) \
locale(mutt:zh_CN) \
locale(mutt:zh_TW) \
mutt-lang \
mutt:/usr/share/locale/en_GB/LC_MESSAGES/mutt.mo"

RDEPENDS:${PN} += "mutt"

inherit rpm
