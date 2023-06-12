SUMMARY = "Translations for package gpg2"
DESCRIPTION = "Provides translations for the 'gpg2' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.8"

RPM_NAME = "gpg2-lang-2.3.8-2.1.noarch.rpm"
RPM_HASH = "1b49706ef7dd7bb9bb8a29e5a3298e815cc18c9b7175f8dced6f39bcf3452ea142c9c20f0f4729a6b5e2d9366159c51b4630c127f9566076f212780aa75fc6f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpg2-lang \
gpg2-lang-all \
locale(gpg2:ca) \
locale(gpg2:cs) \
locale(gpg2:da) \
locale(gpg2:de) \
locale(gpg2:el) \
locale(gpg2:eo) \
locale(gpg2:es) \
locale(gpg2:et) \
locale(gpg2:fi) \
locale(gpg2:fr) \
locale(gpg2:gl) \
locale(gpg2:hu) \
locale(gpg2:id) \
locale(gpg2:it) \
locale(gpg2:ja) \
locale(gpg2:nb) \
locale(gpg2:pl) \
locale(gpg2:pt) \
locale(gpg2:ro) \
locale(gpg2:ru) \
locale(gpg2:sk) \
locale(gpg2:sv) \
locale(gpg2:tr) \
locale(gpg2:uk) \
locale(gpg2:zh_CN) \
locale(gpg2:zh_TW)"
RDEPENDS:${PN} += "gpg2"

inherit rpm
