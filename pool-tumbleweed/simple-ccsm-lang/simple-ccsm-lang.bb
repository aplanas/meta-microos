SUMMARY = "Translations for package simple-ccsm"
DESCRIPTION = "Provides translations for the 'simple-ccsm' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "simple-ccsm-lang-0.8.18-2.10.noarch.rpm"
RPM_HASH = "a0105a23a087b87ec385aa16700fe85f0ff1ff68da6b1980bc646b91c8ec0ee6e6639be59b35f51c7a21495e43d0dc1b2abff18256d5c41594890f38f956ffab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(simple-ccsm:bg) \
locale(simple-ccsm:ca) \
locale(simple-ccsm:cs) \
locale(simple-ccsm:da) \
locale(simple-ccsm:de) \
locale(simple-ccsm:el) \
locale(simple-ccsm:en_GB) \
locale(simple-ccsm:es) \
locale(simple-ccsm:eu) \
locale(simple-ccsm:fi) \
locale(simple-ccsm:fr) \
locale(simple-ccsm:gl) \
locale(simple-ccsm:hu) \
locale(simple-ccsm:it) \
locale(simple-ccsm:ja) \
locale(simple-ccsm:ko) \
locale(simple-ccsm:nb) \
locale(simple-ccsm:nl) \
locale(simple-ccsm:pl) \
locale(simple-ccsm:pt) \
locale(simple-ccsm:pt_BR) \
locale(simple-ccsm:ru) \
locale(simple-ccsm:sk) \
locale(simple-ccsm:sv) \
locale(simple-ccsm:tr) \
locale(simple-ccsm:zh_CN) \
locale(simple-ccsm:zh_TW) \
simple-ccsm-lang \
simple-ccsm-lang-all"
RDEPENDS:${PN} += "simple-ccsm"

inherit rpm
