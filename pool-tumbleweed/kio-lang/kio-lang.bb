SUMMARY = "Translations for package kio"
DESCRIPTION = "Provides translations for the 'kio' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kio-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "91ff16f7429520d223b199c6621851264a06d6f6d5f16a3a4446340730305c39cc830a42e160d28f52292b749464548516ec2f246a2571207ea0d12230ab553f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio-lang \
kio-lang-all \
locale(kio:af) \
locale(kio:ar) \
locale(kio:ast) \
locale(kio:az) \
locale(kio:be) \
locale(kio:be@latin) \
locale(kio:bg) \
locale(kio:bn) \
locale(kio:br) \
locale(kio:bs) \
locale(kio:ca) \
locale(kio:ca@valencia) \
locale(kio:cs) \
locale(kio:cy) \
locale(kio:da) \
locale(kio:de) \
locale(kio:el) \
locale(kio:en_GB) \
locale(kio:eo) \
locale(kio:es) \
locale(kio:et) \
locale(kio:eu) \
locale(kio:fa) \
locale(kio:fi) \
locale(kio:fr) \
locale(kio:ga) \
locale(kio:gl) \
locale(kio:gu) \
locale(kio:he) \
locale(kio:hi) \
locale(kio:hr) \
locale(kio:hu) \
locale(kio:ia) \
locale(kio:id) \
locale(kio:is) \
locale(kio:it) \
locale(kio:ja) \
locale(kio:ka) \
locale(kio:kk) \
locale(kio:km) \
locale(kio:ko) \
locale(kio:lt) \
locale(kio:lv) \
locale(kio:mai) \
locale(kio:mk) \
locale(kio:ml) \
locale(kio:mr) \
locale(kio:ms) \
locale(kio:nb) \
locale(kio:nds) \
locale(kio:ne) \
locale(kio:nl) \
locale(kio:nn) \
locale(kio:oc) \
locale(kio:pa) \
locale(kio:pl) \
locale(kio:pt) \
locale(kio:pt_BR) \
locale(kio:ro) \
locale(kio:ru) \
locale(kio:sk) \
locale(kio:sl) \
locale(kio:sq) \
locale(kio:sr) \
locale(kio:sr@ijekavian) \
locale(kio:sr@ijekavianlatin) \
locale(kio:sr@latin) \
locale(kio:sv) \
locale(kio:ta) \
locale(kio:th) \
locale(kio:tr) \
locale(kio:ug) \
locale(kio:uk) \
locale(kio:vi) \
locale(kio:wa) \
locale(kio:zh_CN) \
locale(kio:zh_TW)"
RDEPENDS:${PN} += "kio"

inherit rpm
