SUMMARY = "Translations for package ktrip"
DESCRIPTION = "Provides translations for the 'ktrip' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ktrip-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "67338b5dd0ec82466970b7f755fb048a434d2ee368c18f62445377fc5bb28fca9ce51a1f46e21182c0db9ae03536e3b50434c240510b5f1e17acbc6e9df9f5d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktrip-lang \
ktrip-lang-all \
locale(ktrip:ca) \
locale(ktrip:ca@valencia) \
locale(ktrip:cs) \
locale(ktrip:de) \
locale(ktrip:en_GB) \
locale(ktrip:es) \
locale(ktrip:et) \
locale(ktrip:fi) \
locale(ktrip:fr) \
locale(ktrip:ia) \
locale(ktrip:it) \
locale(ktrip:ja) \
locale(ktrip:ka) \
locale(ktrip:ko) \
locale(ktrip:lt) \
locale(ktrip:nl) \
locale(ktrip:nn) \
locale(ktrip:pl) \
locale(ktrip:pt) \
locale(ktrip:pt_BR) \
locale(ktrip:ru) \
locale(ktrip:sk) \
locale(ktrip:sl) \
locale(ktrip:sv) \
locale(ktrip:tr) \
locale(ktrip:uk) \
locale(ktrip:zh_CN) \
locale(ktrip:zh_TW)"
RDEPENDS:${PN} += "ktrip"

inherit rpm
