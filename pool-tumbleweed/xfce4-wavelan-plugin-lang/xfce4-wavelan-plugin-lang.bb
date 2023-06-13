SUMMARY = "Translations for package xfce4-wavelan-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-wavelan-plugin' package."
LICENSE = "BSD-2-Clause"

PV = "0.6.3"

RPM_NAME = "xfce4-wavelan-plugin-lang-0.6.3-1.4.noarch.rpm"
RPM_HASH = "b0305349fd41aa7df590463b93ddb8f72cf12cdeb596f9d5b30af8f95264e5ad6c57c4f8728052ea8102a7e9ec48af609cf81607eae72d98fa4f0446b0974488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-wavelan-plugin:ar) \
locale(xfce4-wavelan-plugin:be) \
locale(xfce4-wavelan-plugin:bg) \
locale(xfce4-wavelan-plugin:ca) \
locale(xfce4-wavelan-plugin:cs) \
locale(xfce4-wavelan-plugin:da) \
locale(xfce4-wavelan-plugin:de) \
locale(xfce4-wavelan-plugin:el) \
locale(xfce4-wavelan-plugin:en_AU) \
locale(xfce4-wavelan-plugin:en_CA) \
locale(xfce4-wavelan-plugin:en_GB) \
locale(xfce4-wavelan-plugin:es) \
locale(xfce4-wavelan-plugin:et) \
locale(xfce4-wavelan-plugin:eu) \
locale(xfce4-wavelan-plugin:fi) \
locale(xfce4-wavelan-plugin:fr) \
locale(xfce4-wavelan-plugin:gl) \
locale(xfce4-wavelan-plugin:he) \
locale(xfce4-wavelan-plugin:hr) \
locale(xfce4-wavelan-plugin:hu) \
locale(xfce4-wavelan-plugin:id) \
locale(xfce4-wavelan-plugin:is) \
locale(xfce4-wavelan-plugin:it) \
locale(xfce4-wavelan-plugin:ja) \
locale(xfce4-wavelan-plugin:ko) \
locale(xfce4-wavelan-plugin:lt) \
locale(xfce4-wavelan-plugin:lv) \
locale(xfce4-wavelan-plugin:ms) \
locale(xfce4-wavelan-plugin:nb) \
locale(xfce4-wavelan-plugin:nl) \
locale(xfce4-wavelan-plugin:oc) \
locale(xfce4-wavelan-plugin:pl) \
locale(xfce4-wavelan-plugin:pt) \
locale(xfce4-wavelan-plugin:pt_BR) \
locale(xfce4-wavelan-plugin:ru) \
locale(xfce4-wavelan-plugin:sk) \
locale(xfce4-wavelan-plugin:sl) \
locale(xfce4-wavelan-plugin:sq) \
locale(xfce4-wavelan-plugin:sr) \
locale(xfce4-wavelan-plugin:sv) \
locale(xfce4-wavelan-plugin:th) \
locale(xfce4-wavelan-plugin:tr) \
locale(xfce4-wavelan-plugin:ug) \
locale(xfce4-wavelan-plugin:uk) \
locale(xfce4-wavelan-plugin:vi) \
locale(xfce4-wavelan-plugin:zh_CN) \
locale(xfce4-wavelan-plugin:zh_TW) \
xfce4-panel-plugin-wavelan-lang \
xfce4-wavelan-plugin-lang \
xfce4-wavelan-plugin-lang-all"

RDEPENDS:${PN} += "xfce4-wavelan-plugin"

inherit rpm
