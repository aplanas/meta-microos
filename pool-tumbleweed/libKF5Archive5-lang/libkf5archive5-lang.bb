SUMMARY = "Translations for package libKF5Archive5"
DESCRIPTION = "Provides translations for the 'libKF5Archive5' package."
LICENSE = "LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Archive5-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "088d0172b4831268fe1792350b88400e8158e303cd484586d4613dc93d4b3dcbda9ec47abb948a9f7b58877f2fb29882cfbb175193eb2c13448c65248b1ca063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5Archive5-lang \
libKF5Archive5-lang-all \
locale(libKF5Archive5:ar) \
locale(libKF5Archive5:ca) \
locale(libKF5Archive5:ca@valencia) \
locale(libKF5Archive5:cs) \
locale(libKF5Archive5:de) \
locale(libKF5Archive5:en_GB) \
locale(libKF5Archive5:es) \
locale(libKF5Archive5:fi) \
locale(libKF5Archive5:fr) \
locale(libKF5Archive5:ia) \
locale(libKF5Archive5:it) \
locale(libKF5Archive5:ja) \
locale(libKF5Archive5:ka) \
locale(libKF5Archive5:lt) \
locale(libKF5Archive5:nl) \
locale(libKF5Archive5:nn) \
locale(libKF5Archive5:pl) \
locale(libKF5Archive5:pt) \
locale(libKF5Archive5:ru) \
locale(libKF5Archive5:sk) \
locale(libKF5Archive5:sl) \
locale(libKF5Archive5:tr) \
locale(libKF5Archive5:uk) \
locale(libKF5Archive5:zh_CN) \
locale(libKF5Archive5:zh_TW)"
RDEPENDS:${PN} += "libKF5Archive5"

inherit rpm
