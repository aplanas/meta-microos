SUMMARY = "Translations for package xfce4-sensors-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-sensors-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "xfce4-sensors-plugin-lang-1.4.4-1.3.noarch.rpm"
RPM_HASH = "3c3e2ab11bafc9ba0c69fea42bbb130c39fcecb0db2b46897571e8539195879edab9437b55bf1e4f3b7253206dd696f46cb42db644e2b807d41b7f0f3b53630b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-sensors-plugin:ar) \
locale(xfce4-sensors-plugin:be) \
locale(xfce4-sensors-plugin:bg) \
locale(xfce4-sensors-plugin:ca) \
locale(xfce4-sensors-plugin:cs) \
locale(xfce4-sensors-plugin:da) \
locale(xfce4-sensors-plugin:de) \
locale(xfce4-sensors-plugin:el) \
locale(xfce4-sensors-plugin:en_AU) \
locale(xfce4-sensors-plugin:en_GB) \
locale(xfce4-sensors-plugin:es) \
locale(xfce4-sensors-plugin:eu) \
locale(xfce4-sensors-plugin:fi) \
locale(xfce4-sensors-plugin:fr) \
locale(xfce4-sensors-plugin:gl) \
locale(xfce4-sensors-plugin:he) \
locale(xfce4-sensors-plugin:hr) \
locale(xfce4-sensors-plugin:hu) \
locale(xfce4-sensors-plugin:id) \
locale(xfce4-sensors-plugin:is) \
locale(xfce4-sensors-plugin:it) \
locale(xfce4-sensors-plugin:ja) \
locale(xfce4-sensors-plugin:ko) \
locale(xfce4-sensors-plugin:lt) \
locale(xfce4-sensors-plugin:lv) \
locale(xfce4-sensors-plugin:ms) \
locale(xfce4-sensors-plugin:nb) \
locale(xfce4-sensors-plugin:nl) \
locale(xfce4-sensors-plugin:oc) \
locale(xfce4-sensors-plugin:pl) \
locale(xfce4-sensors-plugin:pt) \
locale(xfce4-sensors-plugin:pt_BR) \
locale(xfce4-sensors-plugin:ru) \
locale(xfce4-sensors-plugin:sk) \
locale(xfce4-sensors-plugin:sl) \
locale(xfce4-sensors-plugin:sq) \
locale(xfce4-sensors-plugin:sr) \
locale(xfce4-sensors-plugin:sv) \
locale(xfce4-sensors-plugin:th) \
locale(xfce4-sensors-plugin:tr) \
locale(xfce4-sensors-plugin:ug) \
locale(xfce4-sensors-plugin:uk) \
locale(xfce4-sensors-plugin:vi) \
locale(xfce4-sensors-plugin:zh_CN) \
locale(xfce4-sensors-plugin:zh_TW) \
xfce4-panel-plugin-sensors-lang \
xfce4-sensors-plugin-lang \
xfce4-sensors-plugin-lang-all"
RDEPENDS:${PN} += "xfce4-sensors-plugin"

inherit rpm
