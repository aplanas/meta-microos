SUMMARY = "Translations for package xfce4-panel-plugin-indicator"
DESCRIPTION = "Provides translations for the 'xfce4-panel-plugin-indicator' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.1"

RPM_NAME = "xfce4-panel-plugin-indicator-lang-2.4.1-1.7.noarch.rpm"
RPM_HASH = "0955f895f5c2f49a4e977f9eb38f82f330eeba022a71343eceb0f3d6ebb1ff6a38b8152b73f60e18e6f6f4f84a21350a6d9fc41f5d291a060835619fc128b192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-panel-plugin-indicator:ar) \
locale(xfce4-panel-plugin-indicator:ast) \
locale(xfce4-panel-plugin-indicator:be) \
locale(xfce4-panel-plugin-indicator:bg) \
locale(xfce4-panel-plugin-indicator:ca) \
locale(xfce4-panel-plugin-indicator:cs) \
locale(xfce4-panel-plugin-indicator:da) \
locale(xfce4-panel-plugin-indicator:de) \
locale(xfce4-panel-plugin-indicator:el) \
locale(xfce4-panel-plugin-indicator:en_AU) \
locale(xfce4-panel-plugin-indicator:en_GB) \
locale(xfce4-panel-plugin-indicator:es) \
locale(xfce4-panel-plugin-indicator:eu) \
locale(xfce4-panel-plugin-indicator:fi) \
locale(xfce4-panel-plugin-indicator:fr) \
locale(xfce4-panel-plugin-indicator:gl) \
locale(xfce4-panel-plugin-indicator:he) \
locale(xfce4-panel-plugin-indicator:hr) \
locale(xfce4-panel-plugin-indicator:hu) \
locale(xfce4-panel-plugin-indicator:id) \
locale(xfce4-panel-plugin-indicator:is) \
locale(xfce4-panel-plugin-indicator:it) \
locale(xfce4-panel-plugin-indicator:ja) \
locale(xfce4-panel-plugin-indicator:ko) \
locale(xfce4-panel-plugin-indicator:lt) \
locale(xfce4-panel-plugin-indicator:ms) \
locale(xfce4-panel-plugin-indicator:nb) \
locale(xfce4-panel-plugin-indicator:nl) \
locale(xfce4-panel-plugin-indicator:oc) \
locale(xfce4-panel-plugin-indicator:pl) \
locale(xfce4-panel-plugin-indicator:pt) \
locale(xfce4-panel-plugin-indicator:pt_BR) \
locale(xfce4-panel-plugin-indicator:ro) \
locale(xfce4-panel-plugin-indicator:ru) \
locale(xfce4-panel-plugin-indicator:sk) \
locale(xfce4-panel-plugin-indicator:sl) \
locale(xfce4-panel-plugin-indicator:sq) \
locale(xfce4-panel-plugin-indicator:sr) \
locale(xfce4-panel-plugin-indicator:sv) \
locale(xfce4-panel-plugin-indicator:th) \
locale(xfce4-panel-plugin-indicator:tr) \
locale(xfce4-panel-plugin-indicator:ug) \
locale(xfce4-panel-plugin-indicator:uk) \
locale(xfce4-panel-plugin-indicator:zh_CN) \
locale(xfce4-panel-plugin-indicator:zh_TW) \
xfce4-panel-plugin-indicator-lang \
xfce4-panel-plugin-indicator-lang-all"

RDEPENDS:${PN} += "xfce4-panel-plugin-indicator"

inherit rpm
