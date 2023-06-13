SUMMARY = "Translations for package rapid-photo-downloader"
DESCRIPTION = "Provides translations for the 'rapid-photo-downloader' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.34"

RPM_NAME = "rapid-photo-downloader-lang-0.9.34-2.1.noarch.rpm"
RPM_HASH = "17a2c31a4daaa63897f04a24da91e19ff5d231fe4b5c218730395192d4561062e5075f9c7a7a9a61dedab37900eec736d2442e5f62f7bf646239191b827be165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(rapid-photo-downloader:ar) \
locale(rapid-photo-downloader:be) \
locale(rapid-photo-downloader:bg) \
locale(rapid-photo-downloader:ca) \
locale(rapid-photo-downloader:cs) \
locale(rapid-photo-downloader:da) \
locale(rapid-photo-downloader:de) \
locale(rapid-photo-downloader:el) \
locale(rapid-photo-downloader:es) \
locale(rapid-photo-downloader:et) \
locale(rapid-photo-downloader:fa) \
locale(rapid-photo-downloader:fi) \
locale(rapid-photo-downloader:fr) \
locale(rapid-photo-downloader:hr) \
locale(rapid-photo-downloader:hu) \
locale(rapid-photo-downloader:id) \
locale(rapid-photo-downloader:it) \
locale(rapid-photo-downloader:ja) \
locale(rapid-photo-downloader:nb) \
locale(rapid-photo-downloader:nl) \
locale(rapid-photo-downloader:nn) \
locale(rapid-photo-downloader:oc) \
locale(rapid-photo-downloader:pl) \
locale(rapid-photo-downloader:pt) \
locale(rapid-photo-downloader:pt_BR) \
locale(rapid-photo-downloader:ro) \
locale(rapid-photo-downloader:ru) \
locale(rapid-photo-downloader:sk) \
locale(rapid-photo-downloader:sq) \
locale(rapid-photo-downloader:sr) \
locale(rapid-photo-downloader:sv) \
locale(rapid-photo-downloader:tr) \
locale(rapid-photo-downloader:uk) \
locale(rapid-photo-downloader:zh_CN) \
rapid-photo-downloader-lang \
rapid-photo-downloader-lang-all"

RDEPENDS:${PN} += "rapid-photo-downloader"

inherit rpm
