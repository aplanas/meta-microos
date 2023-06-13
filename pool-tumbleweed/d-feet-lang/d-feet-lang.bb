SUMMARY = "Translations for package d-feet"
DESCRIPTION = "Provides translations for the 'd-feet' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.16"

RPM_NAME = "d-feet-lang-0.3.16-2.5.noarch.rpm"
RPM_HASH = "1c4328cabeb1dbd6e9f353a40ea9ae9a422d590fd2ff1958fad9ffa8489fa7a19821e7e80c2735717862977c763174fa6bd3a2c5ac3aa012171720778b697498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "d-feet-lang \
d-feet-lang-all \
locale(d-feet:bs) \
locale(d-feet:cs) \
locale(d-feet:da) \
locale(d-feet:de) \
locale(d-feet:el) \
locale(d-feet:en_GB) \
locale(d-feet:es) \
locale(d-feet:eu) \
locale(d-feet:fi) \
locale(d-feet:fr) \
locale(d-feet:fur) \
locale(d-feet:gl) \
locale(d-feet:hr) \
locale(d-feet:hu) \
locale(d-feet:id) \
locale(d-feet:lv) \
locale(d-feet:nb) \
locale(d-feet:nl) \
locale(d-feet:oc) \
locale(d-feet:pl) \
locale(d-feet:pt) \
locale(d-feet:pt_BR) \
locale(d-feet:ro) \
locale(d-feet:ru) \
locale(d-feet:sl) \
locale(d-feet:sr) \
locale(d-feet:sr@latin) \
locale(d-feet:sv) \
locale(d-feet:tr) \
locale(d-feet:uk) \
locale(d-feet:zh_CN)"

RDEPENDS:${PN} += "d-feet"

inherit rpm
