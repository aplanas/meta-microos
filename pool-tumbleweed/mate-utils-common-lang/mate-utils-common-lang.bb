SUMMARY = "Languages for MATE utilities"
DESCRIPTION = "Provides common translations shared by Caja extensions"
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-utils-common-lang-1.26.1-1.1.noarch.rpm"
RPM_HASH = "fee47077b76a0ae5337d5deeb0154e94ebd8ed0b0582873323eab5363f2c96a6fb045e02330564af936fe9fbfb6d2e8cb52d9694a9fa181e66fc229437ffdb4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-utils-common:af) \
locale(mate-utils-common:ar) \
locale(mate-utils-common:as) \
locale(mate-utils-common:ast) \
locale(mate-utils-common:az) \
locale(mate-utils-common:be) \
locale(mate-utils-common:bg) \
locale(mate-utils-common:bn) \
locale(mate-utils-common:bn_IN) \
locale(mate-utils-common:br) \
locale(mate-utils-common:bs) \
locale(mate-utils-common:ca) \
locale(mate-utils-common:ca@valencia) \
locale(mate-utils-common:cs) \
locale(mate-utils-common:cy) \
locale(mate-utils-common:da) \
locale(mate-utils-common:de) \
locale(mate-utils-common:dz) \
locale(mate-utils-common:el) \
locale(mate-utils-common:en_AU) \
locale(mate-utils-common:en_CA) \
locale(mate-utils-common:en_GB) \
locale(mate-utils-common:en_US) \
locale(mate-utils-common:eo) \
locale(mate-utils-common:es) \
locale(mate-utils-common:es_AR) \
locale(mate-utils-common:es_CL) \
locale(mate-utils-common:es_CO) \
locale(mate-utils-common:es_ES) \
locale(mate-utils-common:es_MX) \
locale(mate-utils-common:es_PR) \
locale(mate-utils-common:et) \
locale(mate-utils-common:eu) \
locale(mate-utils-common:fa) \
locale(mate-utils-common:fi) \
locale(mate-utils-common:fr) \
locale(mate-utils-common:fr_CA) \
locale(mate-utils-common:fur) \
locale(mate-utils-common:ga) \
locale(mate-utils-common:gd) \
locale(mate-utils-common:gl) \
locale(mate-utils-common:gu) \
locale(mate-utils-common:he) \
locale(mate-utils-common:hi) \
locale(mate-utils-common:hr) \
locale(mate-utils-common:hu) \
locale(mate-utils-common:ia) \
locale(mate-utils-common:id) \
locale(mate-utils-common:is) \
locale(mate-utils-common:it) \
locale(mate-utils-common:ja) \
locale(mate-utils-common:ka) \
locale(mate-utils-common:kk) \
locale(mate-utils-common:kn) \
locale(mate-utils-common:ko) \
locale(mate-utils-common:lt) \
locale(mate-utils-common:lv) \
locale(mate-utils-common:mai) \
locale(mate-utils-common:mk) \
locale(mate-utils-common:ml) \
locale(mate-utils-common:mr) \
locale(mate-utils-common:ms) \
locale(mate-utils-common:nb) \
locale(mate-utils-common:nds) \
locale(mate-utils-common:ne) \
locale(mate-utils-common:nl) \
locale(mate-utils-common:nn) \
locale(mate-utils-common:oc) \
locale(mate-utils-common:or) \
locale(mate-utils-common:pa) \
locale(mate-utils-common:pl) \
locale(mate-utils-common:pt) \
locale(mate-utils-common:pt_BR) \
locale(mate-utils-common:ro) \
locale(mate-utils-common:ru) \
locale(mate-utils-common:si) \
locale(mate-utils-common:sk) \
locale(mate-utils-common:sl) \
locale(mate-utils-common:sq) \
locale(mate-utils-common:sr) \
locale(mate-utils-common:sr@latin) \
locale(mate-utils-common:sv) \
locale(mate-utils-common:ta) \
locale(mate-utils-common:te) \
locale(mate-utils-common:th) \
locale(mate-utils-common:tr) \
locale(mate-utils-common:ug) \
locale(mate-utils-common:uk) \
locale(mate-utils-common:vi) \
locale(mate-utils-common:wa) \
locale(mate-utils-common:zh_CN) \
locale(mate-utils-common:zh_HK) \
locale(mate-utils-common:zh_TW) \
mate-dictionary-lang \
mate-disk-image-mounter-lang \
mate-disk-usage-analyzer-lang \
mate-screenshot-lang \
mate-search-tool-lang \
mate-system-log-lang \
mate-utils-common-lang"

RDEPENDS:${PN} += ""

inherit rpm
