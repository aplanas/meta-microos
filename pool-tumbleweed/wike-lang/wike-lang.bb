SUMMARY = "Translations for package wike"
DESCRIPTION = "Provides translations for the 'wike' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.1"

RPM_NAME = "wike-lang-2.0.1-1.1.noarch.rpm"
RPM_HASH = "efbbf584699a8507628e244001da42b4bb6a6b4967a5063337c4d708d5089f1da25bfc0674e049a74642d585a85f834c4fc4be8df2391dbb988656467567db81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(wike:bg) \
locale(wike:bn) \
locale(wike:ca) \
locale(wike:cs) \
locale(wike:de) \
locale(wike:el) \
locale(wike:es) \
locale(wike:eu) \
locale(wike:fa) \
locale(wike:fi) \
locale(wike:fr) \
locale(wike:gl) \
locale(wike:he) \
locale(wike:hr) \
locale(wike:ia) \
locale(wike:id) \
locale(wike:it) \
locale(wike:ja) \
locale(wike:nl) \
locale(wike:pl) \
locale(wike:pt_BR) \
locale(wike:ru) \
locale(wike:sv) \
locale(wike:ta) \
locale(wike:tr) \
locale(wike:zh) \
wike-lang \
wike-lang-all"
RDEPENDS:${PN} += "wike"

inherit rpm
