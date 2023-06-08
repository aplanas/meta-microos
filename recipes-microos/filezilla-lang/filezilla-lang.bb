SUMMARY = "Translations for package filezilla"
DESCRIPTION = "Provides translations for the 'filezilla' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.63.2.1"

RPM_NAME = "filezilla-lang-3.63.2.1-2.2.noarch.rpm"
RPM_HASH = "4c351d1f347169db109035730dd98251fa8edfbd64c5a66f100caa21143e65ec6e82c312bf9e3826add0220daaca395c3619cb55cc653f172a54dbee94d4219d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "filezilla-lang filezilla-lang-all locale(filezilla:ar) locale(filezilla:az) locale(filezilla:ca) locale(filezilla:cs_CZ) locale(filezilla:cy) locale(filezilla:da) locale(filezilla:de) locale(filezilla:el) locale(filezilla:es) locale(filezilla:et) locale(filezilla:eu) locale(filezilla:fi_FI) locale(filezilla:fr) locale(filezilla:hr) locale(filezilla:is) locale(filezilla:it) locale(filezilla:ka) locale(filezilla:nb_NO) locale(filezilla:ne) locale(filezilla:nl) locale(filezilla:nn_NO) locale(filezilla:oc) locale(filezilla:pl_PL) locale(filezilla:pt_BR) locale(filezilla:pt_PT) locale(filezilla:ru) locale(filezilla:sl_SI) locale(filezilla:sr) locale(filezilla:sv) locale(filezilla:ta) locale(filezilla:tr) locale(filezilla:uk_UA) locale(filezilla:zh_CN) locale(filezilla:zh_TW)"
RDEPENDS:${PN} += "filezilla"

inherit rpm
