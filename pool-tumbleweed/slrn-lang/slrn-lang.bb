SUMMARY = "Translations for package slrn"
DESCRIPTION = "Provides translations for the 'slrn' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "slrn-lang-1.0.3-3.18.noarch.rpm"
RPM_HASH = "64cf175ce7fe2934d485755af456c73dcfd4dd03f0e6b9a1f5fbf2aa6e8960fd254be3b7b6722ecd86b11d0db5075f492d9fa28daddb5bf68a0d168ee06287b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(slrn:be) \
locale(slrn:da) \
locale(slrn:de) \
locale(slrn:es) \
locale(slrn:fi) \
locale(slrn:fr) \
locale(slrn:it) \
locale(slrn:ko) \
locale(slrn:nl) \
locale(slrn:pl) \
locale(slrn:ru) \
locale(slrn:sv) \
locale(slrn:tr) \
slrn-lang \
slrn-lang-all"

RDEPENDS:${PN} += "slrn"

inherit rpm
