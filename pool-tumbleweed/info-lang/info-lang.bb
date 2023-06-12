SUMMARY = "Translations for package info"
DESCRIPTION = "Provides translations for the 'info' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "info-lang-7.0.3-1.1.noarch.rpm"
RPM_HASH = "cb750bdb714dcdb9de461fe6ffe87966241971b1535e03aed6503befd105db23f02f45eb90edd5d243bbfc2b16070fb167aaa2df44cdbc3ec0278db8366a808e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "info-lang \
info-lang-all \
locale(info:ca) \
locale(info:cs) \
locale(info:da) \
locale(info:de) \
locale(info:el) \
locale(info:eo) \
locale(info:es) \
locale(info:fi) \
locale(info:fr) \
locale(info:he) \
locale(info:hr) \
locale(info:hu) \
locale(info:id) \
locale(info:it) \
locale(info:ja) \
locale(info:nb) \
locale(info:nl) \
locale(info:pl) \
locale(info:pt) \
locale(info:pt_BR) \
locale(info:ro) \
locale(info:ru) \
locale(info:sk) \
locale(info:sl) \
locale(info:sr) \
locale(info:sv) \
locale(info:tr) \
locale(info:uk) \
locale(info:vi) \
locale(info:zh_CN) \
locale(info:zh_TW)"
RDEPENDS:${PN} += "info"

inherit rpm
