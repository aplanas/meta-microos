SUMMARY = "Translations for package cryptsetup"
DESCRIPTION = "Provides translations for the 'cryptsetup' package.(cryptsetup)"
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "cryptsetup-lang-2.6.1-1.3.noarch.rpm"
RPM_HASH = "df52b22ce98bf5908d83a8e45efe38d8beeb638d1c0a398672978a81bee8b0dde9904706559d01585e4a7bef4f5360063b89da0af4788ee6b259583646d0b704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cryptsetup-lang \
cryptsetup-lang-all \
locale(cryptsetup:cs) \
locale(cryptsetup:da) \
locale(cryptsetup:de) \
locale(cryptsetup:es) \
locale(cryptsetup:fi) \
locale(cryptsetup:fr) \
locale(cryptsetup:id) \
locale(cryptsetup:it) \
locale(cryptsetup:ja) \
locale(cryptsetup:ka) \
locale(cryptsetup:nl) \
locale(cryptsetup:pl) \
locale(cryptsetup:pt_BR) \
locale(cryptsetup:ro) \
locale(cryptsetup:ru) \
locale(cryptsetup:sr) \
locale(cryptsetup:sv) \
locale(cryptsetup:uk) \
locale(cryptsetup:vi) \
locale(cryptsetup:zh_CN)"
RDEPENDS:${PN} += "cryptsetup"

inherit rpm
