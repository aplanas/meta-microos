SUMMARY = "Translations for wxWidgets"
DESCRIPTION = "Provides translations for wxWidgets."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "wxWidgets-lang-3.0.5.1-4.1.noarch.rpm"
RPM_HASH = "9696d68ea6556731a9bc1b3413416c2bd53b158c1e8d3b5672c043341290e87a8b2fb7693af125b31199f2ca25179b8fb093fc57c15270c837d8331c13b3cbc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(wxWidgets:ca) \
locale(wxWidgets:cs) \
locale(wxWidgets:da) \
locale(wxWidgets:de) \
locale(wxWidgets:el) \
locale(wxWidgets:es) \
locale(wxWidgets:fi) \
locale(wxWidgets:fr) \
locale(wxWidgets:hu) \
locale(wxWidgets:id) \
locale(wxWidgets:it) \
locale(wxWidgets:ja) \
locale(wxWidgets:nl) \
locale(wxWidgets:pl) \
locale(wxWidgets:ru) \
locale(wxWidgets:sl) \
locale(wxWidgets:sv) \
locale(wxWidgets:tr) \
locale(wxWidgets:uk) \
locale(wxWidgets:zh_CN) \
locale(wxWidgets:zh_TW) \
wxWidgets-lang \
wxWidgets-lang-all"

RDEPENDS:${PN} += ""

inherit rpm
