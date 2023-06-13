SUMMARY = "Translations for package gpaste"
DESCRIPTION = "Provides translations for the 'gpaste' package."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "gpaste-lang-43.2+6-2.1.noarch.rpm"
RPM_HASH = "b424207571b60ae545ff312c4fb5eefb65cc91c5137b031692df11ec557c9f5ec88809faa6bbe74147190a487f62cad8f1d5bd64cf07c718a69a14f83285b1c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpaste-lang \
gpaste-lang-all \
locale(gpaste:ar) \
locale(gpaste:cs) \
locale(gpaste:de) \
locale(gpaste:es) \
locale(gpaste:fa) \
locale(gpaste:fr) \
locale(gpaste:gl) \
locale(gpaste:it) \
locale(gpaste:ja) \
locale(gpaste:ka) \
locale(gpaste:nb_NO) \
locale(gpaste:oc) \
locale(gpaste:pl) \
locale(gpaste:pt_BR) \
locale(gpaste:ru) \
locale(gpaste:sl) \
locale(gpaste:sv) \
locale(gpaste:tr) \
locale(gpaste:vi) \
locale(gpaste:zh_CN) \
locale(gpaste:zh_Hant)"

RDEPENDS:${PN} += "gpaste"

inherit rpm
