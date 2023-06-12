SUMMARY = "Translations for package libKPim5Gravatar5"
DESCRIPTION = "Provides translations for the 'libKPim5Gravatar5' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5Gravatar5-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "c27f5d12e6fad120aa5e7cb3d21927c6be415d4ddc495a1e1b02c1b90bb945918b32d97c89f6bea073bca1e44bced9200675e54c6e8652ee85018ac64384fea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim5Gravatar5-lang \
libKPim5Gravatar5-lang-all \
locale(libKPim5Gravatar5:ar) \
locale(libKPim5Gravatar5:ca) \
locale(libKPim5Gravatar5:ca@valencia) \
locale(libKPim5Gravatar5:cs) \
locale(libKPim5Gravatar5:da) \
locale(libKPim5Gravatar5:de) \
locale(libKPim5Gravatar5:el) \
locale(libKPim5Gravatar5:en_GB) \
locale(libKPim5Gravatar5:es) \
locale(libKPim5Gravatar5:et) \
locale(libKPim5Gravatar5:eu) \
locale(libKPim5Gravatar5:fi) \
locale(libKPim5Gravatar5:fr) \
locale(libKPim5Gravatar5:gl) \
locale(libKPim5Gravatar5:hi) \
locale(libKPim5Gravatar5:hu) \
locale(libKPim5Gravatar5:ia) \
locale(libKPim5Gravatar5:is) \
locale(libKPim5Gravatar5:it) \
locale(libKPim5Gravatar5:ja) \
locale(libKPim5Gravatar5:ka) \
locale(libKPim5Gravatar5:ko) \
locale(libKPim5Gravatar5:lt) \
locale(libKPim5Gravatar5:nl) \
locale(libKPim5Gravatar5:nn) \
locale(libKPim5Gravatar5:pl) \
locale(libKPim5Gravatar5:pt) \
locale(libKPim5Gravatar5:pt_BR) \
locale(libKPim5Gravatar5:ro) \
locale(libKPim5Gravatar5:ru) \
locale(libKPim5Gravatar5:sk) \
locale(libKPim5Gravatar5:sl) \
locale(libKPim5Gravatar5:sr) \
locale(libKPim5Gravatar5:sr@ijekavian) \
locale(libKPim5Gravatar5:sr@ijekavianlatin) \
locale(libKPim5Gravatar5:sr@latin) \
locale(libKPim5Gravatar5:sv) \
locale(libKPim5Gravatar5:tr) \
locale(libKPim5Gravatar5:uk) \
locale(libKPim5Gravatar5:zh_CN) \
locale(libKPim5Gravatar5:zh_TW)"
RDEPENDS:${PN} += "libKPim5Gravatar5"

inherit rpm
