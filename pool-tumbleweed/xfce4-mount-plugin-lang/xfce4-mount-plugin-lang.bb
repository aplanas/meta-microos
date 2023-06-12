SUMMARY = "Translations for package xfce4-mount-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-mount-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.6"

RPM_NAME = "xfce4-mount-plugin-lang-1.1.6-1.1.noarch.rpm"
RPM_HASH = "1a305a3f878e3ad36acb935ad02cb31d7302d632d76d1bb8d3674a58dc069aa99bb2915de3f6c1cd519ed75e70e22552b1a5452861276585d915d4ebfb934cb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-mount-plugin:ar) \
locale(xfce4-mount-plugin:be) \
locale(xfce4-mount-plugin:bg) \
locale(xfce4-mount-plugin:ca) \
locale(xfce4-mount-plugin:cs) \
locale(xfce4-mount-plugin:da) \
locale(xfce4-mount-plugin:de) \
locale(xfce4-mount-plugin:el) \
locale(xfce4-mount-plugin:en_AU) \
locale(xfce4-mount-plugin:en_GB) \
locale(xfce4-mount-plugin:es) \
locale(xfce4-mount-plugin:et) \
locale(xfce4-mount-plugin:eu) \
locale(xfce4-mount-plugin:fi) \
locale(xfce4-mount-plugin:fr) \
locale(xfce4-mount-plugin:gl) \
locale(xfce4-mount-plugin:he) \
locale(xfce4-mount-plugin:hr) \
locale(xfce4-mount-plugin:hu) \
locale(xfce4-mount-plugin:id) \
locale(xfce4-mount-plugin:is) \
locale(xfce4-mount-plugin:it) \
locale(xfce4-mount-plugin:ja) \
locale(xfce4-mount-plugin:ko) \
locale(xfce4-mount-plugin:lt) \
locale(xfce4-mount-plugin:lv) \
locale(xfce4-mount-plugin:ms) \
locale(xfce4-mount-plugin:nb) \
locale(xfce4-mount-plugin:nl) \
locale(xfce4-mount-plugin:oc) \
locale(xfce4-mount-plugin:pa) \
locale(xfce4-mount-plugin:pl) \
locale(xfce4-mount-plugin:pt) \
locale(xfce4-mount-plugin:pt_BR) \
locale(xfce4-mount-plugin:ru) \
locale(xfce4-mount-plugin:sk) \
locale(xfce4-mount-plugin:sq) \
locale(xfce4-mount-plugin:sr) \
locale(xfce4-mount-plugin:sv) \
locale(xfce4-mount-plugin:th) \
locale(xfce4-mount-plugin:tr) \
locale(xfce4-mount-plugin:ug) \
locale(xfce4-mount-plugin:uk) \
locale(xfce4-mount-plugin:vi) \
locale(xfce4-mount-plugin:zh_CN) \
locale(xfce4-mount-plugin:zh_TW) \
xfce4-mount-plugin-lang \
xfce4-mount-plugin-lang-all \
xfce4-panel-plugin-mount-lang"
RDEPENDS:${PN} += "xfce4-mount-plugin"

inherit rpm
