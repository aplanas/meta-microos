SUMMARY = "Translations for package libkgantt"
DESCRIPTION = "Provides translations for the 'libkgantt' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libkgantt-lang-2.8.0-1.14.noarch.rpm"
RPM_HASH = "7b3b3a757b9b892f66e55bc4ee31132ca9f0e8637ca14f15e8634fbc4b7c91d6584787e9a972891b359964b9cecb110165599b7846dc6040908421ae769bb731"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkgantt-lang \
libkgantt-lang-all \
locale(libkgantt:ar) \
locale(libkgantt:ast) \
locale(libkgantt:bg) \
locale(libkgantt:bs) \
locale(libkgantt:ca) \
locale(libkgantt:ca@valencia) \
locale(libkgantt:cs) \
locale(libkgantt:da) \
locale(libkgantt:de) \
locale(libkgantt:el) \
locale(libkgantt:en_GB) \
locale(libkgantt:es) \
locale(libkgantt:et) \
locale(libkgantt:eu) \
locale(libkgantt:fi) \
locale(libkgantt:fr) \
locale(libkgantt:gl) \
locale(libkgantt:it) \
locale(libkgantt:ko) \
locale(libkgantt:nl) \
locale(libkgantt:nn) \
locale(libkgantt:pl) \
locale(libkgantt:pt) \
locale(libkgantt:pt_BR) \
locale(libkgantt:ru) \
locale(libkgantt:sk) \
locale(libkgantt:sv) \
locale(libkgantt:tr) \
locale(libkgantt:uk) \
locale(libkgantt:zh_CN) \
locale(libkgantt:zh_TW)"
RDEPENDS:${PN} += "libkgantt"

inherit rpm
