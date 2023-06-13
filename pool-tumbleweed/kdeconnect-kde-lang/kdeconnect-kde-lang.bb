SUMMARY = "Translations for package kdeconnect-kde"
DESCRIPTION = "Provides translations for the 'kdeconnect-kde' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdeconnect-kde-lang-23.04.1-2.1.noarch.rpm"
RPM_HASH = "d33002313c96a459e530f291d296a70846f55afbfc6ed6500eb414ca1c2edf3e6a9f0f58522fc28c1d971e70a13e96a57391299c2f899b5bcd117d162aad06e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdeconnect-kde-lang \
kdeconnect-kde-lang-all \
locale(kdeconnect-kde:ar) \
locale(kdeconnect-kde:az) \
locale(kdeconnect-kde:bg) \
locale(kdeconnect-kde:bs) \
locale(kdeconnect-kde:ca) \
locale(kdeconnect-kde:ca@valencia) \
locale(kdeconnect-kde:cs) \
locale(kdeconnect-kde:da) \
locale(kdeconnect-kde:de) \
locale(kdeconnect-kde:el) \
locale(kdeconnect-kde:en_GB) \
locale(kdeconnect-kde:es) \
locale(kdeconnect-kde:et) \
locale(kdeconnect-kde:eu) \
locale(kdeconnect-kde:fi) \
locale(kdeconnect-kde:fr) \
locale(kdeconnect-kde:gl) \
locale(kdeconnect-kde:he) \
locale(kdeconnect-kde:hu) \
locale(kdeconnect-kde:ia) \
locale(kdeconnect-kde:id) \
locale(kdeconnect-kde:is) \
locale(kdeconnect-kde:it) \
locale(kdeconnect-kde:ja) \
locale(kdeconnect-kde:ka) \
locale(kdeconnect-kde:ko) \
locale(kdeconnect-kde:lt) \
locale(kdeconnect-kde:ml) \
locale(kdeconnect-kde:nl) \
locale(kdeconnect-kde:nn) \
locale(kdeconnect-kde:pl) \
locale(kdeconnect-kde:pt) \
locale(kdeconnect-kde:pt_BR) \
locale(kdeconnect-kde:ro) \
locale(kdeconnect-kde:ru) \
locale(kdeconnect-kde:sk) \
locale(kdeconnect-kde:sl) \
locale(kdeconnect-kde:sr) \
locale(kdeconnect-kde:sr@ijekavian) \
locale(kdeconnect-kde:sr@ijekavianlatin) \
locale(kdeconnect-kde:sr@latin) \
locale(kdeconnect-kde:sv) \
locale(kdeconnect-kde:ta) \
locale(kdeconnect-kde:tr) \
locale(kdeconnect-kde:uk) \
locale(kdeconnect-kde:zh_CN) \
locale(kdeconnect-kde:zh_TW)"

RDEPENDS:${PN} += "kdeconnect-kde"

inherit rpm
