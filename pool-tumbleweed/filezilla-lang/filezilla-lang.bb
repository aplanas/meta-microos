SUMMARY = "Translations for package filezilla"
DESCRIPTION = "Provides translations for the 'filezilla' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.64.0"

RPM_NAME = "filezilla-lang-3.64.0-1.1.noarch.rpm"
RPM_HASH = "8f4da6dba562b6c22852a878ec21c9cb4ad9415313dff912651f6162d91fdc6c24a1836d17f1d219e0ea89c004822c114a5c8196c95d7b7ad632158143176edf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "filezilla-lang \
filezilla-lang-all \
locale(filezilla:ar) \
locale(filezilla:az) \
locale(filezilla:ca) \
locale(filezilla:cs_CZ) \
locale(filezilla:cy) \
locale(filezilla:da) \
locale(filezilla:de) \
locale(filezilla:el) \
locale(filezilla:es) \
locale(filezilla:et) \
locale(filezilla:eu) \
locale(filezilla:fi_FI) \
locale(filezilla:fr) \
locale(filezilla:hr) \
locale(filezilla:is) \
locale(filezilla:it) \
locale(filezilla:ka) \
locale(filezilla:nb_NO) \
locale(filezilla:ne) \
locale(filezilla:nl) \
locale(filezilla:nn_NO) \
locale(filezilla:oc) \
locale(filezilla:pl_PL) \
locale(filezilla:pt_BR) \
locale(filezilla:pt_PT) \
locale(filezilla:ru) \
locale(filezilla:sl_SI) \
locale(filezilla:sr) \
locale(filezilla:sv) \
locale(filezilla:ta) \
locale(filezilla:tr) \
locale(filezilla:uk_UA) \
locale(filezilla:zh_CN) \
locale(filezilla:zh_TW)"
RDEPENDS:${PN} += "filezilla"

inherit rpm
