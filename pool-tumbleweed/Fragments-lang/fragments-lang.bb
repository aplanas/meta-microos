SUMMARY = "Translations for package Fragments"
DESCRIPTION = "Provides translations for the 'Fragments' package."
LICENSE = "GPL-3.0-only"

PV = "2.1"

RPM_NAME = "Fragments-lang-2.1-3.1.noarch.rpm"
RPM_HASH = "dacc96d01010072e2c46dc79b9bf63672bd86792d7388b6d0255b7d05696147ee106a73179304e068ab6bcd130f7a47cb39291e08f76d1a88cc1002215942ebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Fragments-lang \
Fragments-lang-all \
locale(Fragments:ca) \
locale(Fragments:cs) \
locale(Fragments:da) \
locale(Fragments:de) \
locale(Fragments:el) \
locale(Fragments:en_GB) \
locale(Fragments:eo) \
locale(Fragments:es) \
locale(Fragments:eu) \
locale(Fragments:fi) \
locale(Fragments:fr) \
locale(Fragments:fur) \
locale(Fragments:gl) \
locale(Fragments:he) \
locale(Fragments:hr) \
locale(Fragments:hu) \
locale(Fragments:id) \
locale(Fragments:is) \
locale(Fragments:it) \
locale(Fragments:ja) \
locale(Fragments:ko) \
locale(Fragments:nb) \
locale(Fragments:nl) \
locale(Fragments:oc) \
locale(Fragments:pl) \
locale(Fragments:pt) \
locale(Fragments:pt_BR) \
locale(Fragments:ro) \
locale(Fragments:ru) \
locale(Fragments:sk) \
locale(Fragments:sl) \
locale(Fragments:sr) \
locale(Fragments:sv) \
locale(Fragments:tr) \
locale(Fragments:uk) \
locale(Fragments:vi) \
locale(Fragments:zh_CN)"

RDEPENDS:${PN} += "Fragments"

inherit rpm
