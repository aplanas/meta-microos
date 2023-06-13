SUMMARY = "Translations for package xfce4-diskperf-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-diskperf-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "xfce4-diskperf-plugin-lang-2.7.0-1.7.noarch.rpm"
RPM_HASH = "40d63d5a5f97e1c529dcd18f1546ff32b0dc3fd4659c72974797ef083ac1897308a82c8be9e6cc6827f31a8ad186414044a8c72314833f43f6a60a1fd47c9dba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-diskperf-plugin:ar) \
locale(xfce4-diskperf-plugin:be) \
locale(xfce4-diskperf-plugin:bg) \
locale(xfce4-diskperf-plugin:ca) \
locale(xfce4-diskperf-plugin:cs) \
locale(xfce4-diskperf-plugin:da) \
locale(xfce4-diskperf-plugin:de) \
locale(xfce4-diskperf-plugin:el) \
locale(xfce4-diskperf-plugin:en_AU) \
locale(xfce4-diskperf-plugin:en_CA) \
locale(xfce4-diskperf-plugin:en_GB) \
locale(xfce4-diskperf-plugin:es) \
locale(xfce4-diskperf-plugin:eu) \
locale(xfce4-diskperf-plugin:fr) \
locale(xfce4-diskperf-plugin:gl) \
locale(xfce4-diskperf-plugin:he) \
locale(xfce4-diskperf-plugin:hr) \
locale(xfce4-diskperf-plugin:hu) \
locale(xfce4-diskperf-plugin:id) \
locale(xfce4-diskperf-plugin:is) \
locale(xfce4-diskperf-plugin:it) \
locale(xfce4-diskperf-plugin:ja) \
locale(xfce4-diskperf-plugin:ko) \
locale(xfce4-diskperf-plugin:lt) \
locale(xfce4-diskperf-plugin:lv) \
locale(xfce4-diskperf-plugin:ms) \
locale(xfce4-diskperf-plugin:nb) \
locale(xfce4-diskperf-plugin:nl) \
locale(xfce4-diskperf-plugin:oc) \
locale(xfce4-diskperf-plugin:pa) \
locale(xfce4-diskperf-plugin:pl) \
locale(xfce4-diskperf-plugin:pt) \
locale(xfce4-diskperf-plugin:pt_BR) \
locale(xfce4-diskperf-plugin:ru) \
locale(xfce4-diskperf-plugin:sk) \
locale(xfce4-diskperf-plugin:sl) \
locale(xfce4-diskperf-plugin:sq) \
locale(xfce4-diskperf-plugin:sr) \
locale(xfce4-diskperf-plugin:sv) \
locale(xfce4-diskperf-plugin:th) \
locale(xfce4-diskperf-plugin:tr) \
locale(xfce4-diskperf-plugin:ug) \
locale(xfce4-diskperf-plugin:uk) \
locale(xfce4-diskperf-plugin:zh_CN) \
locale(xfce4-diskperf-plugin:zh_TW) \
xfce4-diskperf-plugin-lang \
xfce4-diskperf-plugin-lang-all \
xfce4-panel-plugin-diskperf-lang"

RDEPENDS:${PN} += "xfce4-diskperf-plugin"

inherit rpm
