SUMMARY = "Translations for package libKF5Su5"
DESCRIPTION = "Provides translations for the 'libKF5Su5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Su5-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "68b55de1102229aabaf90983b132945ff4a4bc37bff7dc45cf4f986ca28e46108190256dd457c5e11b98fa15eb46f3c00843a5d858b661e5fc590b79b99c68db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5Su5-lang \
libKF5Su5-lang-all \
locale(libKF5Su5:ar) \
locale(libKF5Su5:ast) \
locale(libKF5Su5:az) \
locale(libKF5Su5:bg) \
locale(libKF5Su5:bs) \
locale(libKF5Su5:ca) \
locale(libKF5Su5:ca@valencia) \
locale(libKF5Su5:cs) \
locale(libKF5Su5:da) \
locale(libKF5Su5:de) \
locale(libKF5Su5:el) \
locale(libKF5Su5:en_GB) \
locale(libKF5Su5:es) \
locale(libKF5Su5:et) \
locale(libKF5Su5:eu) \
locale(libKF5Su5:fi) \
locale(libKF5Su5:fr) \
locale(libKF5Su5:gd) \
locale(libKF5Su5:gl) \
locale(libKF5Su5:hi) \
locale(libKF5Su5:hu) \
locale(libKF5Su5:ia) \
locale(libKF5Su5:id) \
locale(libKF5Su5:is) \
locale(libKF5Su5:it) \
locale(libKF5Su5:ja) \
locale(libKF5Su5:ka) \
locale(libKF5Su5:ko) \
locale(libKF5Su5:lt) \
locale(libKF5Su5:ml) \
locale(libKF5Su5:nb) \
locale(libKF5Su5:nds) \
locale(libKF5Su5:nl) \
locale(libKF5Su5:nn) \
locale(libKF5Su5:pa) \
locale(libKF5Su5:pl) \
locale(libKF5Su5:pt) \
locale(libKF5Su5:pt_BR) \
locale(libKF5Su5:ro) \
locale(libKF5Su5:ru) \
locale(libKF5Su5:sk) \
locale(libKF5Su5:sl) \
locale(libKF5Su5:sr) \
locale(libKF5Su5:sr@ijekavian) \
locale(libKF5Su5:sr@ijekavianlatin) \
locale(libKF5Su5:sr@latin) \
locale(libKF5Su5:sv) \
locale(libKF5Su5:tr) \
locale(libKF5Su5:uk) \
locale(libKF5Su5:vi) \
locale(libKF5Su5:zh_CN) \
locale(libKF5Su5:zh_TW)"
RDEPENDS:${PN} += "libKF5Su5"

inherit rpm
