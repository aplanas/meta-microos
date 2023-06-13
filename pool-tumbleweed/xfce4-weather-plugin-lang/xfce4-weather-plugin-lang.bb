SUMMARY = "Translations for package xfce4-weather-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-weather-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.11.1"

RPM_NAME = "xfce4-weather-plugin-lang-0.11.1-1.1.noarch.rpm"
RPM_HASH = "fcfece31d97adbc695d4994f8295731c42543596ad56d9e0c0e77b51ed8b07033b58097246872fc92cb9c17e3266124e486018357d6a0e90f18e020dd2f373ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-weather-plugin:ar) \
locale(xfce4-weather-plugin:be) \
locale(xfce4-weather-plugin:bg) \
locale(xfce4-weather-plugin:ca) \
locale(xfce4-weather-plugin:cs) \
locale(xfce4-weather-plugin:da) \
locale(xfce4-weather-plugin:de) \
locale(xfce4-weather-plugin:el) \
locale(xfce4-weather-plugin:en_AU) \
locale(xfce4-weather-plugin:en_GB) \
locale(xfce4-weather-plugin:es) \
locale(xfce4-weather-plugin:et) \
locale(xfce4-weather-plugin:eu) \
locale(xfce4-weather-plugin:fi) \
locale(xfce4-weather-plugin:fr) \
locale(xfce4-weather-plugin:gl) \
locale(xfce4-weather-plugin:he) \
locale(xfce4-weather-plugin:hr) \
locale(xfce4-weather-plugin:hu) \
locale(xfce4-weather-plugin:id) \
locale(xfce4-weather-plugin:is) \
locale(xfce4-weather-plugin:it) \
locale(xfce4-weather-plugin:ja) \
locale(xfce4-weather-plugin:ko) \
locale(xfce4-weather-plugin:lt) \
locale(xfce4-weather-plugin:lv) \
locale(xfce4-weather-plugin:ms) \
locale(xfce4-weather-plugin:nb) \
locale(xfce4-weather-plugin:nl) \
locale(xfce4-weather-plugin:nn) \
locale(xfce4-weather-plugin:oc) \
locale(xfce4-weather-plugin:pa) \
locale(xfce4-weather-plugin:pl) \
locale(xfce4-weather-plugin:pt) \
locale(xfce4-weather-plugin:pt_BR) \
locale(xfce4-weather-plugin:ru) \
locale(xfce4-weather-plugin:sk) \
locale(xfce4-weather-plugin:sl) \
locale(xfce4-weather-plugin:sq) \
locale(xfce4-weather-plugin:sr) \
locale(xfce4-weather-plugin:sv) \
locale(xfce4-weather-plugin:te) \
locale(xfce4-weather-plugin:th) \
locale(xfce4-weather-plugin:tr) \
locale(xfce4-weather-plugin:ug) \
locale(xfce4-weather-plugin:uk) \
locale(xfce4-weather-plugin:zh_CN) \
locale(xfce4-weather-plugin:zh_TW) \
xfce4-panel-plugin-weather-lang \
xfce4-weather-plugin-lang \
xfce4-weather-plugin-lang-all"

RDEPENDS:${PN} += "xfce4-weather-plugin"

inherit rpm
