SUMMARY = "Translations for package dcraw"
DESCRIPTION = "Provides translations for the 'dcraw' package."
LICENSE = "GPL-2.0-or-later"

PV = "9.28.0"

RPM_NAME = "dcraw-lang-9.28.0-2.7.noarch.rpm"
RPM_HASH = "2c0125b1e65285cdcdf66bc8fdecec45c6a67b39df8e59f5365c0fb5037f372fe7353ea48a3b4914728f92da799d0ecceb601d61a62629484ff3ffc4772d3408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dcraw-lang dcraw-lang-all locale(dcraw:ca) locale(dcraw:cs) locale(dcraw:da) locale(dcraw:de) locale(dcraw:eo) locale(dcraw:es) locale(dcraw:fr) locale(dcraw:hu) locale(dcraw:it) locale(dcraw:ja) locale(dcraw:nl) locale(dcraw:pl) locale(dcraw:pt) locale(dcraw:ro) locale(dcraw:ru) locale(dcraw:sv) locale(dcraw:zh_CN) locale(dcraw:zh_TW)"
RDEPENDS:${PN} += "dcraw"

inherit rpm
