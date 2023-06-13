SUMMARY = "Translations for package parted"
DESCRIPTION = "Provides translations for the 'parted' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.5"

RPM_NAME = "parted-lang-3.5-4.4.noarch.rpm"
RPM_HASH = "4556416f86b50614117e72e419adc67ee4da1c5094f5034bd85a3980c3d2127cad0f87d698d21ee37d6f4c6cf32a66e847f1b9044a9f8e880f158aa1bcf22364"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(parted:ca) \
locale(parted:cs) \
locale(parted:da) \
locale(parted:de) \
locale(parted:es) \
locale(parted:fr) \
locale(parted:fur) \
locale(parted:gl) \
locale(parted:hu) \
locale(parted:id) \
locale(parted:it) \
locale(parted:ja) \
locale(parted:ko) \
locale(parted:nl) \
locale(parted:nn) \
locale(parted:pl) \
locale(parted:pt) \
locale(parted:pt_BR) \
locale(parted:ro) \
locale(parted:ru) \
locale(parted:sk) \
locale(parted:sl) \
locale(parted:sr) \
locale(parted:sv) \
locale(parted:tr) \
locale(parted:uk) \
locale(parted:vi) \
locale(parted:zh_CN) \
locale(parted:zh_TW) \
parted-lang \
parted-lang-all"

RDEPENDS:${PN} += "parted"

inherit rpm
