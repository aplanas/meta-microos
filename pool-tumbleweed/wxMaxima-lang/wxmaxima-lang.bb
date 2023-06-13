SUMMARY = "Translations for package wxMaxima"
DESCRIPTION = "Provides translations for the 'wxMaxima' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.05.0"

RPM_NAME = "wxMaxima-lang-23.05.0-1.1.noarch.rpm"
RPM_HASH = "f9844301a3a70b10e9669f63c4d9efaa7a16f930f01064fca26811715ba6dc1c460bd4aee78b4d4b05981a1c6d820430d07e6eaf42abcc539345cd57c5c2c962"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(wxMaxima:ca) \
locale(wxMaxima:cs) \
locale(wxMaxima:da) \
locale(wxMaxima:de) \
locale(wxMaxima:el) \
locale(wxMaxima:en) \
locale(wxMaxima:es) \
locale(wxMaxima:fi) \
locale(wxMaxima:fr) \
locale(wxMaxima:gl) \
locale(wxMaxima:hu) \
locale(wxMaxima:it) \
locale(wxMaxima:ja) \
locale(wxMaxima:nb) \
locale(wxMaxima:pl) \
locale(wxMaxima:pt_BR) \
locale(wxMaxima:ru) \
locale(wxMaxima:tr) \
locale(wxMaxima:uk) \
locale(wxMaxima:zh_CN) \
locale(wxMaxima:zh_TW) \
wxMaxima-lang \
wxMaxima-lang-all"

RDEPENDS:${PN} += "wxMaxima"

inherit rpm
