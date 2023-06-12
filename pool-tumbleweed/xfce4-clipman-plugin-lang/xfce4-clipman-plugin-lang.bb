SUMMARY = "Translations for package xfce4-clipman-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-clipman-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.3"

RPM_NAME = "xfce4-clipman-plugin-lang-1.6.3-1.1.noarch.rpm"
RPM_HASH = "ffb69426fcb0ba27bdef85acbed3235a1a7f7c8ab658b65591bf32a1d33942e658a34f1e1881a4b4d7d0f4884b3b59427a2d6f9007b93fe5feb55ff04a004fe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-clipman-plugin:ar) \
locale(xfce4-clipman-plugin:ast) \
locale(xfce4-clipman-plugin:be) \
locale(xfce4-clipman-plugin:bg) \
locale(xfce4-clipman-plugin:ca) \
locale(xfce4-clipman-plugin:cs) \
locale(xfce4-clipman-plugin:da) \
locale(xfce4-clipman-plugin:de) \
locale(xfce4-clipman-plugin:el) \
locale(xfce4-clipman-plugin:en_AU) \
locale(xfce4-clipman-plugin:en_GB) \
locale(xfce4-clipman-plugin:es) \
locale(xfce4-clipman-plugin:et) \
locale(xfce4-clipman-plugin:eu) \
locale(xfce4-clipman-plugin:fi) \
locale(xfce4-clipman-plugin:fr) \
locale(xfce4-clipman-plugin:gl) \
locale(xfce4-clipman-plugin:he) \
locale(xfce4-clipman-plugin:hr) \
locale(xfce4-clipman-plugin:hu) \
locale(xfce4-clipman-plugin:id) \
locale(xfce4-clipman-plugin:is) \
locale(xfce4-clipman-plugin:it) \
locale(xfce4-clipman-plugin:ja) \
locale(xfce4-clipman-plugin:kk) \
locale(xfce4-clipman-plugin:ko) \
locale(xfce4-clipman-plugin:lt) \
locale(xfce4-clipman-plugin:lv) \
locale(xfce4-clipman-plugin:ms) \
locale(xfce4-clipman-plugin:nb) \
locale(xfce4-clipman-plugin:nl) \
locale(xfce4-clipman-plugin:oc) \
locale(xfce4-clipman-plugin:pl) \
locale(xfce4-clipman-plugin:pt) \
locale(xfce4-clipman-plugin:pt_BR) \
locale(xfce4-clipman-plugin:ru) \
locale(xfce4-clipman-plugin:sk) \
locale(xfce4-clipman-plugin:sl) \
locale(xfce4-clipman-plugin:sq) \
locale(xfce4-clipman-plugin:sr) \
locale(xfce4-clipman-plugin:sv) \
locale(xfce4-clipman-plugin:th) \
locale(xfce4-clipman-plugin:tr) \
locale(xfce4-clipman-plugin:ug) \
locale(xfce4-clipman-plugin:uk) \
locale(xfce4-clipman-plugin:vi) \
locale(xfce4-clipman-plugin:zh_CN) \
locale(xfce4-clipman-plugin:zh_TW) \
xfce4-clipman-plugin-lang \
xfce4-clipman-plugin-lang-all \
xfce4-panel-plugin-clipman-lang"
RDEPENDS:${PN} += "xfce4-clipman-plugin"

inherit rpm
