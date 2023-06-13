SUMMARY = "Translations for package xfce4-battery-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-battery-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.5"

RPM_NAME = "xfce4-battery-plugin-lang-1.1.5-1.1.noarch.rpm"
RPM_HASH = "5a44f9a9185b58c127d85f7a0f8e66695303838a363f96ef21242e677e47ed2c81594bc0d54f84053cd1411110652303b4bdca1c65816f9de6af93fa428bbad0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-battery-plugin:ar) \
locale(xfce4-battery-plugin:be) \
locale(xfce4-battery-plugin:bg) \
locale(xfce4-battery-plugin:ca) \
locale(xfce4-battery-plugin:cs) \
locale(xfce4-battery-plugin:da) \
locale(xfce4-battery-plugin:de) \
locale(xfce4-battery-plugin:el) \
locale(xfce4-battery-plugin:en_AU) \
locale(xfce4-battery-plugin:en_CA) \
locale(xfce4-battery-plugin:en_GB) \
locale(xfce4-battery-plugin:es) \
locale(xfce4-battery-plugin:et) \
locale(xfce4-battery-plugin:eu) \
locale(xfce4-battery-plugin:fi) \
locale(xfce4-battery-plugin:fr) \
locale(xfce4-battery-plugin:ga) \
locale(xfce4-battery-plugin:gl) \
locale(xfce4-battery-plugin:he) \
locale(xfce4-battery-plugin:hr) \
locale(xfce4-battery-plugin:hu) \
locale(xfce4-battery-plugin:id) \
locale(xfce4-battery-plugin:is) \
locale(xfce4-battery-plugin:it) \
locale(xfce4-battery-plugin:ja) \
locale(xfce4-battery-plugin:ko) \
locale(xfce4-battery-plugin:lt) \
locale(xfce4-battery-plugin:lv) \
locale(xfce4-battery-plugin:ms) \
locale(xfce4-battery-plugin:nb) \
locale(xfce4-battery-plugin:nl) \
locale(xfce4-battery-plugin:nn) \
locale(xfce4-battery-plugin:oc) \
locale(xfce4-battery-plugin:pa) \
locale(xfce4-battery-plugin:pl) \
locale(xfce4-battery-plugin:pt) \
locale(xfce4-battery-plugin:pt_BR) \
locale(xfce4-battery-plugin:ru) \
locale(xfce4-battery-plugin:sk) \
locale(xfce4-battery-plugin:sl) \
locale(xfce4-battery-plugin:sq) \
locale(xfce4-battery-plugin:sr) \
locale(xfce4-battery-plugin:sv) \
locale(xfce4-battery-plugin:th) \
locale(xfce4-battery-plugin:tr) \
locale(xfce4-battery-plugin:ug) \
locale(xfce4-battery-plugin:uk) \
locale(xfce4-battery-plugin:vi) \
locale(xfce4-battery-plugin:zh_CN) \
locale(xfce4-battery-plugin:zh_TW) \
xfce4-battery-plugin-lang \
xfce4-battery-plugin-lang-all \
xfce4-panel-plugin-battery-lang"

RDEPENDS:${PN} += "xfce4-battery-plugin"

inherit rpm
