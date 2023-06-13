SUMMARY = "Languages for package libxfce4ui"
DESCRIPTION = "Provides translations to the package libxfce4ui"
LICENSE = "LGPL-2.1-or-later"

PV = "4.18.4"

RPM_NAME = "libxfce4ui-lang-4.18.4-1.1.noarch.rpm"
RPM_HASH = "93ef6a7864985af0d5b0d915c0ac46425a7495be450e9fc0d0d0f12426296a9596a1d1c7b490c49c837b5326e0af0e4dde208cece38c808d9902cf8e270d51b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libxfce4ui-lang \
libxfce4ui-lang-all \
locale(libxfce4ui:ar) \
locale(libxfce4ui:az) \
locale(libxfce4ui:be) \
locale(libxfce4ui:bg) \
locale(libxfce4ui:bn) \
locale(libxfce4ui:ca) \
locale(libxfce4ui:cs) \
locale(libxfce4ui:cy) \
locale(libxfce4ui:da) \
locale(libxfce4ui:de) \
locale(libxfce4ui:el) \
locale(libxfce4ui:en_AU) \
locale(libxfce4ui:en_GB) \
locale(libxfce4ui:es) \
locale(libxfce4ui:et) \
locale(libxfce4ui:eu) \
locale(libxfce4ui:fi) \
locale(libxfce4ui:fr) \
locale(libxfce4ui:gl) \
locale(libxfce4ui:he) \
locale(libxfce4ui:hr) \
locale(libxfce4ui:hu) \
locale(libxfce4ui:id) \
locale(libxfce4ui:is) \
locale(libxfce4ui:it) \
locale(libxfce4ui:ja) \
locale(libxfce4ui:ka) \
locale(libxfce4ui:ko) \
locale(libxfce4ui:lt) \
locale(libxfce4ui:lv) \
locale(libxfce4ui:ms) \
locale(libxfce4ui:nb) \
locale(libxfce4ui:nl) \
locale(libxfce4ui:nn) \
locale(libxfce4ui:oc) \
locale(libxfce4ui:pa) \
locale(libxfce4ui:pl) \
locale(libxfce4ui:pt) \
locale(libxfce4ui:pt_BR) \
locale(libxfce4ui:ro) \
locale(libxfce4ui:ru) \
locale(libxfce4ui:si) \
locale(libxfce4ui:sk) \
locale(libxfce4ui:sl) \
locale(libxfce4ui:sq) \
locale(libxfce4ui:sr) \
locale(libxfce4ui:sv) \
locale(libxfce4ui:te) \
locale(libxfce4ui:th) \
locale(libxfce4ui:tr) \
locale(libxfce4ui:ug) \
locale(libxfce4ui:uk) \
locale(libxfce4ui:vi) \
locale(libxfce4ui:zh_CN) \
locale(libxfce4ui:zh_HK) \
locale(libxfce4ui:zh_TW)"

RDEPENDS:${PN} += "libxfce4ui-2-0"

inherit rpm
