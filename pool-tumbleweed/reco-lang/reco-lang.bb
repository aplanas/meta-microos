SUMMARY = "Translations for package reco"
DESCRIPTION = "Provides translations for the 'reco' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "reco-lang-3.2.1-1.7.noarch.rpm"
RPM_HASH = "8e5d57cb508b69de9715fd611e1fbdd587bbf78ec451d469c431020a8e2895aa877870835d2fc1c05d902b16f5ec0ba7d6e3477ba562adf3962b4fae762e2336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(reco:ca) \
locale(reco:es) \
locale(reco:fr) \
locale(reco:it) \
locale(reco:ja) \
locale(reco:lt) \
locale(reco:nl) \
locale(reco:pl) \
locale(reco:pt) \
locale(reco:pt_BR) \
locale(reco:ru) \
locale(reco:tr) \
reco-lang \
reco-lang-all"

RDEPENDS:${PN} += "reco"

inherit rpm
