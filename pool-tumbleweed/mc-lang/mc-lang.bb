SUMMARY = "Translations for package mc"
DESCRIPTION = "Provides translations for the 'mc' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.8.29"

RPM_NAME = "mc-lang-4.8.29-2.1.noarch.rpm"
RPM_HASH = "0e49ab3e14365f8af4a9ee796e99907cfaa827d02347c40815a6cf3ba3cd42ad91da10d72449f226f63e8f8dd00ff8485622ead7935d658e5e1acecb702f78fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mc:af) \
locale(mc:ar) \
locale(mc:az) \
locale(mc:be) \
locale(mc:bg) \
locale(mc:br) \
locale(mc:ca) \
locale(mc:cs) \
locale(mc:da) \
locale(mc:de) \
locale(mc:de_CH) \
locale(mc:el) \
locale(mc:en_GB) \
locale(mc:eo) \
locale(mc:es) \
locale(mc:et) \
locale(mc:eu) \
locale(mc:fa) \
locale(mc:fi) \
locale(mc:fr) \
locale(mc:fr_CA) \
locale(mc:ga) \
locale(mc:gl) \
locale(mc:he) \
locale(mc:hr) \
locale(mc:hu) \
locale(mc:ia) \
locale(mc:id) \
locale(mc:it) \
locale(mc:ja) \
locale(mc:ka) \
locale(mc:kk) \
locale(mc:ko) \
locale(mc:lt) \
locale(mc:lv) \
locale(mc:nb) \
locale(mc:nl) \
locale(mc:nl_BE) \
locale(mc:pl) \
locale(mc:pt) \
locale(mc:pt_BR) \
locale(mc:ro) \
locale(mc:ru) \
locale(mc:sk) \
locale(mc:sl) \
locale(mc:sr) \
locale(mc:sv) \
locale(mc:ta) \
locale(mc:te) \
locale(mc:tr) \
locale(mc:uk) \
locale(mc:vi) \
locale(mc:wa) \
locale(mc:zh_CN) \
locale(mc:zh_TW) \
mc-lang \
mc-lang-all"

RDEPENDS:${PN} += "mc"

inherit rpm
