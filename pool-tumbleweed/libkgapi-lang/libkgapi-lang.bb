SUMMARY = "Translations for package libkgapi"
DESCRIPTION = "Provides translations for the 'libkgapi' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libkgapi-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "b9d38b61155d2760ce24bf93ba01a7a5fc9b7981f839ef4ac71ddcda6dbe41e89fe6c35b2053fdabe95e09f27523f1d6b02930bd32c840971aabd04d7f0fe3bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkgapi-lang \
libkgapi-lang-all \
locale(libkgapi:ar) \
locale(libkgapi:bs) \
locale(libkgapi:ca) \
locale(libkgapi:ca@valencia) \
locale(libkgapi:cs) \
locale(libkgapi:da) \
locale(libkgapi:de) \
locale(libkgapi:el) \
locale(libkgapi:en_GB) \
locale(libkgapi:es) \
locale(libkgapi:et) \
locale(libkgapi:eu) \
locale(libkgapi:fi) \
locale(libkgapi:fr) \
locale(libkgapi:ga) \
locale(libkgapi:gl) \
locale(libkgapi:hu) \
locale(libkgapi:ia) \
locale(libkgapi:it) \
locale(libkgapi:ja) \
locale(libkgapi:ka) \
locale(libkgapi:kk) \
locale(libkgapi:km) \
locale(libkgapi:ko) \
locale(libkgapi:lt) \
locale(libkgapi:mr) \
locale(libkgapi:nb) \
locale(libkgapi:nds) \
locale(libkgapi:nl) \
locale(libkgapi:nn) \
locale(libkgapi:pl) \
locale(libkgapi:pt) \
locale(libkgapi:pt_BR) \
locale(libkgapi:ro) \
locale(libkgapi:ru) \
locale(libkgapi:sk) \
locale(libkgapi:sl) \
locale(libkgapi:sr) \
locale(libkgapi:sr@ijekavian) \
locale(libkgapi:sr@ijekavianlatin) \
locale(libkgapi:sr@latin) \
locale(libkgapi:sv) \
locale(libkgapi:tr) \
locale(libkgapi:ug) \
locale(libkgapi:uk) \
locale(libkgapi:zh_CN) \
locale(libkgapi:zh_TW)"

RDEPENDS:${PN} += "libkgapi"

inherit rpm
