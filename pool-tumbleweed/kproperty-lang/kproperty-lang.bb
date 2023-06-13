SUMMARY = "Translations for package kproperty"
DESCRIPTION = "Provides translations for the 'kproperty' package."
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kproperty-lang-3.2.0-2.21.noarch.rpm"
RPM_HASH = "813d3f36ba74a60d7aaba28007bf5e5e56683f456d821fd3a195fbb243edca082836a97d6191e085019959c3d80027a221e259d0e29c0f76162b727b596bc64b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kproperty-lang \
kproperty-lang-all \
locale(kproperty:ast) \
locale(kproperty:ca) \
locale(kproperty:ca@valencia) \
locale(kproperty:cs) \
locale(kproperty:de) \
locale(kproperty:en_GB) \
locale(kproperty:es) \
locale(kproperty:fi) \
locale(kproperty:fr) \
locale(kproperty:gl) \
locale(kproperty:ia) \
locale(kproperty:it) \
locale(kproperty:ja) \
locale(kproperty:ko) \
locale(kproperty:lt) \
locale(kproperty:nl) \
locale(kproperty:nn) \
locale(kproperty:pl) \
locale(kproperty:pt) \
locale(kproperty:pt_BR) \
locale(kproperty:ru) \
locale(kproperty:sk) \
locale(kproperty:sv) \
locale(kproperty:tr) \
locale(kproperty:uk) \
locale(kproperty:zh_CN) \
locale(kproperty:zh_TW)"

RDEPENDS:${PN} += "kproperty"

inherit rpm
