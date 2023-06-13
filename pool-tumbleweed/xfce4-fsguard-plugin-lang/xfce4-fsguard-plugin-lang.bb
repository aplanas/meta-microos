SUMMARY = "Translations for package xfce4-fsguard-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-fsguard-plugin' package."
LICENSE = "BSD-2-Clause"

PV = "1.1.3"

RPM_NAME = "xfce4-fsguard-plugin-lang-1.1.3-1.1.noarch.rpm"
RPM_HASH = "fcedf7aedb6ff2cc12ed78618628bc9c7b9904d33ca17bd277cf5e762177ca5756bfbc76f5f12fb6cd614789b8448524dcb441248c66cb7b43b4a8761162114d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-fsguard-plugin:ar) \
locale(xfce4-fsguard-plugin:be) \
locale(xfce4-fsguard-plugin:bg) \
locale(xfce4-fsguard-plugin:ca) \
locale(xfce4-fsguard-plugin:cs) \
locale(xfce4-fsguard-plugin:da) \
locale(xfce4-fsguard-plugin:de) \
locale(xfce4-fsguard-plugin:el) \
locale(xfce4-fsguard-plugin:en_AU) \
locale(xfce4-fsguard-plugin:en_CA) \
locale(xfce4-fsguard-plugin:en_GB) \
locale(xfce4-fsguard-plugin:es) \
locale(xfce4-fsguard-plugin:et) \
locale(xfce4-fsguard-plugin:eu) \
locale(xfce4-fsguard-plugin:fi) \
locale(xfce4-fsguard-plugin:fr) \
locale(xfce4-fsguard-plugin:gl) \
locale(xfce4-fsguard-plugin:he) \
locale(xfce4-fsguard-plugin:hr) \
locale(xfce4-fsguard-plugin:hu) \
locale(xfce4-fsguard-plugin:id) \
locale(xfce4-fsguard-plugin:is) \
locale(xfce4-fsguard-plugin:it) \
locale(xfce4-fsguard-plugin:ja) \
locale(xfce4-fsguard-plugin:ko) \
locale(xfce4-fsguard-plugin:lt) \
locale(xfce4-fsguard-plugin:lv) \
locale(xfce4-fsguard-plugin:ms) \
locale(xfce4-fsguard-plugin:nb) \
locale(xfce4-fsguard-plugin:nl) \
locale(xfce4-fsguard-plugin:nn) \
locale(xfce4-fsguard-plugin:oc) \
locale(xfce4-fsguard-plugin:pa) \
locale(xfce4-fsguard-plugin:pl) \
locale(xfce4-fsguard-plugin:pt) \
locale(xfce4-fsguard-plugin:pt_BR) \
locale(xfce4-fsguard-plugin:ru) \
locale(xfce4-fsguard-plugin:sk) \
locale(xfce4-fsguard-plugin:sl) \
locale(xfce4-fsguard-plugin:sq) \
locale(xfce4-fsguard-plugin:sr) \
locale(xfce4-fsguard-plugin:sv) \
locale(xfce4-fsguard-plugin:th) \
locale(xfce4-fsguard-plugin:tr) \
locale(xfce4-fsguard-plugin:ug) \
locale(xfce4-fsguard-plugin:uk) \
locale(xfce4-fsguard-plugin:vi) \
locale(xfce4-fsguard-plugin:zh_CN) \
locale(xfce4-fsguard-plugin:zh_TW) \
xfce4-fsguard-plugin-lang \
xfce4-fsguard-plugin-lang-all \
xfce4-panel-plugin-fsguard-lang"

RDEPENDS:${PN} += "xfce4-fsguard-plugin"

inherit rpm
