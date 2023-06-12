SUMMARY = "Translations for package libsecret"
DESCRIPTION = "Provides translations for the 'libsecret' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.5"

RPM_NAME = "libsecret-lang-0.20.5-1.7.noarch.rpm"
RPM_HASH = "2287a2196d5982186e78765a77e9723ded520ab4a4758069fec36bea7fb4179341d45f2fddaa54db5fdfaf2c20b34302a796d4d1d4fdb710e943dc4cac7674c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsecret-lang \
libsecret-lang-all \
locale(libsecret:ar) \
locale(libsecret:as) \
locale(libsecret:be) \
locale(libsecret:bg) \
locale(libsecret:bs) \
locale(libsecret:ca) \
locale(libsecret:ca@valencia) \
locale(libsecret:cs) \
locale(libsecret:da) \
locale(libsecret:de) \
locale(libsecret:el) \
locale(libsecret:en_GB) \
locale(libsecret:eo) \
locale(libsecret:es) \
locale(libsecret:eu) \
locale(libsecret:fa) \
locale(libsecret:fi) \
locale(libsecret:fr) \
locale(libsecret:fur) \
locale(libsecret:gl) \
locale(libsecret:he) \
locale(libsecret:hr) \
locale(libsecret:hu) \
locale(libsecret:id) \
locale(libsecret:it) \
locale(libsecret:ja) \
locale(libsecret:kk) \
locale(libsecret:ko) \
locale(libsecret:lt) \
locale(libsecret:lv) \
locale(libsecret:ml) \
locale(libsecret:ms) \
locale(libsecret:nb) \
locale(libsecret:ne) \
locale(libsecret:nl) \
locale(libsecret:oc) \
locale(libsecret:pa) \
locale(libsecret:pl) \
locale(libsecret:pt) \
locale(libsecret:pt_BR) \
locale(libsecret:ro) \
locale(libsecret:ru) \
locale(libsecret:sk) \
locale(libsecret:sl) \
locale(libsecret:sr) \
locale(libsecret:sr@latin) \
locale(libsecret:sv) \
locale(libsecret:tr) \
locale(libsecret:uk) \
locale(libsecret:vi) \
locale(libsecret:zh_CN) \
locale(libsecret:zh_HK) \
locale(libsecret:zh_TW)"
RDEPENDS:${PN} += "libsecret"

inherit rpm
