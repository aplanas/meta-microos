SUMMARY = "Translations for package ktp-send-file"
DESCRIPTION = "Provides translations for the 'ktp-send-file' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-send-file-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "bef67bcd4cfab230564f12f5c0b38a6ec2dd0042b2a0e5f52a071dcf950ad5be7607d846223491ffd4bd4f42b9de7d41f6562e7a4a66a5c76fa9b6bcef796d63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktp-send-file-lang \
ktp-send-file-lang-all \
locale(ktp-send-file:ar) \
locale(ktp-send-file:bs) \
locale(ktp-send-file:ca) \
locale(ktp-send-file:ca@valencia) \
locale(ktp-send-file:cs) \
locale(ktp-send-file:da) \
locale(ktp-send-file:de) \
locale(ktp-send-file:el) \
locale(ktp-send-file:en_GB) \
locale(ktp-send-file:es) \
locale(ktp-send-file:et) \
locale(ktp-send-file:eu) \
locale(ktp-send-file:fi) \
locale(ktp-send-file:fr) \
locale(ktp-send-file:ga) \
locale(ktp-send-file:gl) \
locale(ktp-send-file:hi) \
locale(ktp-send-file:hu) \
locale(ktp-send-file:ia) \
locale(ktp-send-file:is) \
locale(ktp-send-file:it) \
locale(ktp-send-file:ja) \
locale(ktp-send-file:ka) \
locale(ktp-send-file:kk) \
locale(ktp-send-file:km) \
locale(ktp-send-file:ko) \
locale(ktp-send-file:lt) \
locale(ktp-send-file:mr) \
locale(ktp-send-file:nb) \
locale(ktp-send-file:nds) \
locale(ktp-send-file:nl) \
locale(ktp-send-file:nn) \
locale(ktp-send-file:pa) \
locale(ktp-send-file:pl) \
locale(ktp-send-file:pt) \
locale(ktp-send-file:pt_BR) \
locale(ktp-send-file:ro) \
locale(ktp-send-file:ru) \
locale(ktp-send-file:sk) \
locale(ktp-send-file:sl) \
locale(ktp-send-file:sr) \
locale(ktp-send-file:sr@ijekavian) \
locale(ktp-send-file:sr@ijekavianlatin) \
locale(ktp-send-file:sr@latin) \
locale(ktp-send-file:sv) \
locale(ktp-send-file:tr) \
locale(ktp-send-file:ug) \
locale(ktp-send-file:uk) \
locale(ktp-send-file:vi) \
locale(ktp-send-file:zh_CN) \
locale(ktp-send-file:zh_TW)"

RDEPENDS:${PN} += "ktp-send-file"

inherit rpm
