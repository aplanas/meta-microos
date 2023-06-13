SUMMARY = "Translations for package kio_audiocd"
DESCRIPTION = "Provides translations for the 'kio_audiocd' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kio_audiocd-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "db29afbe28941f0f32bce3c41730609676c2640f0a69e7faddbb44283befdd9c930e54bc07e08700610c04dccee1678ae198649decd14eae8b73bc5b9f8a0bf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio_audiocd-lang \
kio_audiocd-lang-all \
locale(kio_audiocd:af) \
locale(kio_audiocd:ar) \
locale(kio_audiocd:az) \
locale(kio_audiocd:be) \
locale(kio_audiocd:bg) \
locale(kio_audiocd:bn) \
locale(kio_audiocd:br) \
locale(kio_audiocd:bs) \
locale(kio_audiocd:ca) \
locale(kio_audiocd:ca@valencia) \
locale(kio_audiocd:cs) \
locale(kio_audiocd:cy) \
locale(kio_audiocd:da) \
locale(kio_audiocd:de) \
locale(kio_audiocd:el) \
locale(kio_audiocd:en_GB) \
locale(kio_audiocd:eo) \
locale(kio_audiocd:es) \
locale(kio_audiocd:et) \
locale(kio_audiocd:eu) \
locale(kio_audiocd:fa) \
locale(kio_audiocd:fi) \
locale(kio_audiocd:fr) \
locale(kio_audiocd:ga) \
locale(kio_audiocd:gl) \
locale(kio_audiocd:he) \
locale(kio_audiocd:hi) \
locale(kio_audiocd:hr) \
locale(kio_audiocd:hu) \
locale(kio_audiocd:ia) \
locale(kio_audiocd:id) \
locale(kio_audiocd:is) \
locale(kio_audiocd:it) \
locale(kio_audiocd:ja) \
locale(kio_audiocd:ka) \
locale(kio_audiocd:kk) \
locale(kio_audiocd:km) \
locale(kio_audiocd:ko) \
locale(kio_audiocd:lt) \
locale(kio_audiocd:lv) \
locale(kio_audiocd:mk) \
locale(kio_audiocd:mr) \
locale(kio_audiocd:ms) \
locale(kio_audiocd:nb) \
locale(kio_audiocd:nds) \
locale(kio_audiocd:ne) \
locale(kio_audiocd:nl) \
locale(kio_audiocd:nn) \
locale(kio_audiocd:oc) \
locale(kio_audiocd:pa) \
locale(kio_audiocd:pl) \
locale(kio_audiocd:pt) \
locale(kio_audiocd:pt_BR) \
locale(kio_audiocd:ro) \
locale(kio_audiocd:ru) \
locale(kio_audiocd:sk) \
locale(kio_audiocd:sl) \
locale(kio_audiocd:sq) \
locale(kio_audiocd:sr) \
locale(kio_audiocd:sr@ijekavian) \
locale(kio_audiocd:sr@ijekavianlatin) \
locale(kio_audiocd:sr@latin) \
locale(kio_audiocd:sv) \
locale(kio_audiocd:ta) \
locale(kio_audiocd:th) \
locale(kio_audiocd:tr) \
locale(kio_audiocd:ug) \
locale(kio_audiocd:uk) \
locale(kio_audiocd:vi) \
locale(kio_audiocd:wa) \
locale(kio_audiocd:zh_CN) \
locale(kio_audiocd:zh_HK) \
locale(kio_audiocd:zh_TW)"

RDEPENDS:${PN} += "kio_audiocd"

inherit rpm
