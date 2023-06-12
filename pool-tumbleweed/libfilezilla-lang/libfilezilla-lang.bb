SUMMARY = "Translations for package libfilezilla"
DESCRIPTION = "Provides translations for the 'libfilezilla' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.42.2"

RPM_NAME = "libfilezilla-lang-0.42.2-1.1.noarch.rpm"
RPM_HASH = "cb21ce3c39a927a218dedd2069b137dc86d2f24be2ba34e9bb638d1a183c99985aac0909d585150388f84c42f7a61671fe95b44611921d1cf28e1899be428b3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfilezilla-lang \
libfilezilla-lang-all \
locale(libfilezilla:ar) \
locale(libfilezilla:az) \
locale(libfilezilla:ca) \
locale(libfilezilla:cs_CZ) \
locale(libfilezilla:cy) \
locale(libfilezilla:da) \
locale(libfilezilla:de) \
locale(libfilezilla:el) \
locale(libfilezilla:es) \
locale(libfilezilla:et) \
locale(libfilezilla:eu) \
locale(libfilezilla:fi_FI) \
locale(libfilezilla:fr) \
locale(libfilezilla:hr) \
locale(libfilezilla:is) \
locale(libfilezilla:it) \
locale(libfilezilla:nb_NO) \
locale(libfilezilla:ne) \
locale(libfilezilla:nl) \
locale(libfilezilla:nn_NO) \
locale(libfilezilla:oc) \
locale(libfilezilla:pl_PL) \
locale(libfilezilla:pt_BR) \
locale(libfilezilla:pt_PT) \
locale(libfilezilla:ru) \
locale(libfilezilla:sl_SI) \
locale(libfilezilla:sr) \
locale(libfilezilla:sv) \
locale(libfilezilla:tr) \
locale(libfilezilla:uk_UA) \
locale(libfilezilla:zh_CN) \
locale(libfilezilla:zh_TW)"
RDEPENDS:${PN} += "libfilezilla"

inherit rpm
