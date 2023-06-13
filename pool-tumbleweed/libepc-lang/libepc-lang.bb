SUMMARY = "Translations for package libepc"
DESCRIPTION = "Provides translations for the 'libepc' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.6"

RPM_NAME = "libepc-lang-0.4.6-6.6.noarch.rpm"
RPM_HASH = "9103bc1a1f1a07c018667c94f2eac42c6bf38707c2add5169dde88d201145981868e7b7db9f34c6594f0f3130f0072e2d5af642ef03b59a21513dc736b383a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libepc-lang \
libepc-lang-all \
locale(libepc:ar) \
locale(libepc:bs) \
locale(libepc:ca) \
locale(libepc:cs) \
locale(libepc:da) \
locale(libepc:de) \
locale(libepc:el) \
locale(libepc:en_GB) \
locale(libepc:es) \
locale(libepc:fi) \
locale(libepc:fr) \
locale(libepc:gl) \
locale(libepc:hu) \
locale(libepc:id) \
locale(libepc:it) \
locale(libepc:ja) \
locale(libepc:lv) \
locale(libepc:nb) \
locale(libepc:oc) \
locale(libepc:pl) \
locale(libepc:pt) \
locale(libepc:pt_BR) \
locale(libepc:ro) \
locale(libepc:ru) \
locale(libepc:sl) \
locale(libepc:sr) \
locale(libepc:sr@latin) \
locale(libepc:sv) \
locale(libepc:th) \
locale(libepc:zh_CN)"

RDEPENDS:${PN} += "libepc"

inherit rpm
