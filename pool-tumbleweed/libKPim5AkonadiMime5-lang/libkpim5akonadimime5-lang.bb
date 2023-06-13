SUMMARY = "Translations for package libKPim5AkonadiMime5"
DESCRIPTION = "Provides translations for the 'libKPim5AkonadiMime5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5AkonadiMime5-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "18a6fa64c8a59ebc0e224b807e9a5cf9a37faec87152bcf332df4ce9400d610c8ae461d234881db6ef122985166a6ce81c0e3c8889cbd8edc7cc03633d806f93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim5AkonadiMime5-lang \
libKPim5AkonadiMime5-lang-all \
locale(libKPim5AkonadiMime5:ar) \
locale(libKPim5AkonadiMime5:az) \
locale(libKPim5AkonadiMime5:bg) \
locale(libKPim5AkonadiMime5:bs) \
locale(libKPim5AkonadiMime5:ca) \
locale(libKPim5AkonadiMime5:ca@valencia) \
locale(libKPim5AkonadiMime5:cs) \
locale(libKPim5AkonadiMime5:da) \
locale(libKPim5AkonadiMime5:de) \
locale(libKPim5AkonadiMime5:el) \
locale(libKPim5AkonadiMime5:en_GB) \
locale(libKPim5AkonadiMime5:es) \
locale(libKPim5AkonadiMime5:et) \
locale(libKPim5AkonadiMime5:eu) \
locale(libKPim5AkonadiMime5:fi) \
locale(libKPim5AkonadiMime5:fr) \
locale(libKPim5AkonadiMime5:ga) \
locale(libKPim5AkonadiMime5:gl) \
locale(libKPim5AkonadiMime5:hu) \
locale(libKPim5AkonadiMime5:ia) \
locale(libKPim5AkonadiMime5:it) \
locale(libKPim5AkonadiMime5:ja) \
locale(libKPim5AkonadiMime5:ka) \
locale(libKPim5AkonadiMime5:kk) \
locale(libKPim5AkonadiMime5:km) \
locale(libKPim5AkonadiMime5:ko) \
locale(libKPim5AkonadiMime5:lt) \
locale(libKPim5AkonadiMime5:mai) \
locale(libKPim5AkonadiMime5:mr) \
locale(libKPim5AkonadiMime5:nb) \
locale(libKPim5AkonadiMime5:nds) \
locale(libKPim5AkonadiMime5:nl) \
locale(libKPim5AkonadiMime5:nn) \
locale(libKPim5AkonadiMime5:pl) \
locale(libKPim5AkonadiMime5:pt) \
locale(libKPim5AkonadiMime5:pt_BR) \
locale(libKPim5AkonadiMime5:ro) \
locale(libKPim5AkonadiMime5:ru) \
locale(libKPim5AkonadiMime5:sk) \
locale(libKPim5AkonadiMime5:sl) \
locale(libKPim5AkonadiMime5:sr) \
locale(libKPim5AkonadiMime5:sr@ijekavian) \
locale(libKPim5AkonadiMime5:sr@ijekavianlatin) \
locale(libKPim5AkonadiMime5:sr@latin) \
locale(libKPim5AkonadiMime5:sv) \
locale(libKPim5AkonadiMime5:tr) \
locale(libKPim5AkonadiMime5:ug) \
locale(libKPim5AkonadiMime5:uk) \
locale(libKPim5AkonadiMime5:zh_CN) \
locale(libKPim5AkonadiMime5:zh_TW)"

RDEPENDS:${PN} += "libKPim5AkonadiMime5"

inherit rpm
