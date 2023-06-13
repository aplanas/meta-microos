SUMMARY = "Translations for package artikulate"
DESCRIPTION = "Provides translations for the 'artikulate' package."
LICENSE = "LGPL-3.0-or-later & GPL-2.0-only & BSD-3-Clause"

PV = "23.04.1"

RPM_NAME = "artikulate-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "469e8d472445369c2fd66818403c3129da34e22306ec66e63e2fb575ad22b7b56d7ec73585b41afbc0567ac28fc5b2f44642a17cdbbef1082777d2bf31095668"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "artikulate-lang \
artikulate-lang-all \
locale(artikulate:ar) \
locale(artikulate:az) \
locale(artikulate:bs) \
locale(artikulate:ca) \
locale(artikulate:ca@valencia) \
locale(artikulate:cs) \
locale(artikulate:da) \
locale(artikulate:de) \
locale(artikulate:el) \
locale(artikulate:en_GB) \
locale(artikulate:eo) \
locale(artikulate:es) \
locale(artikulate:et) \
locale(artikulate:eu) \
locale(artikulate:fi) \
locale(artikulate:fr) \
locale(artikulate:gl) \
locale(artikulate:hi) \
locale(artikulate:hu) \
locale(artikulate:ia) \
locale(artikulate:it) \
locale(artikulate:ja) \
locale(artikulate:ka) \
locale(artikulate:ko) \
locale(artikulate:lt) \
locale(artikulate:ml) \
locale(artikulate:mr) \
locale(artikulate:nds) \
locale(artikulate:nl) \
locale(artikulate:nn) \
locale(artikulate:pl) \
locale(artikulate:pt) \
locale(artikulate:pt_BR) \
locale(artikulate:ro) \
locale(artikulate:ru) \
locale(artikulate:sk) \
locale(artikulate:sl) \
locale(artikulate:sv) \
locale(artikulate:tr) \
locale(artikulate:ug) \
locale(artikulate:uk) \
locale(artikulate:zh_CN) \
locale(artikulate:zh_TW)"

RDEPENDS:${PN} += "artikulate"

inherit rpm
