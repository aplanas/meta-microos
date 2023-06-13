SUMMARY = "Translations for package xfce4-systemload-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-systemload-plugin' package."
LICENSE = "BSD-2-Clause"

PV = "1.3.2"

RPM_NAME = "xfce4-systemload-plugin-lang-1.3.2-1.3.noarch.rpm"
RPM_HASH = "7d0d4fb10a3b3e195323a5fb0d1cba277b9070b669f7d16f145e97bc5b45fb40cbd9d32b6c0b4242e6c7dca510c44ae952ac171b701e131c431c93aa10be0bf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-systemload-plugin:ar) \
locale(xfce4-systemload-plugin:be) \
locale(xfce4-systemload-plugin:bg) \
locale(xfce4-systemload-plugin:ca) \
locale(xfce4-systemload-plugin:cs) \
locale(xfce4-systemload-plugin:da) \
locale(xfce4-systemload-plugin:de) \
locale(xfce4-systemload-plugin:el) \
locale(xfce4-systemload-plugin:en_AU) \
locale(xfce4-systemload-plugin:en_CA) \
locale(xfce4-systemload-plugin:en_GB) \
locale(xfce4-systemload-plugin:es) \
locale(xfce4-systemload-plugin:et) \
locale(xfce4-systemload-plugin:eu) \
locale(xfce4-systemload-plugin:fi) \
locale(xfce4-systemload-plugin:fr) \
locale(xfce4-systemload-plugin:gl) \
locale(xfce4-systemload-plugin:he) \
locale(xfce4-systemload-plugin:hr) \
locale(xfce4-systemload-plugin:hu) \
locale(xfce4-systemload-plugin:id) \
locale(xfce4-systemload-plugin:is) \
locale(xfce4-systemload-plugin:it) \
locale(xfce4-systemload-plugin:ja) \
locale(xfce4-systemload-plugin:ko) \
locale(xfce4-systemload-plugin:lt) \
locale(xfce4-systemload-plugin:lv) \
locale(xfce4-systemload-plugin:ms) \
locale(xfce4-systemload-plugin:nb) \
locale(xfce4-systemload-plugin:nl) \
locale(xfce4-systemload-plugin:oc) \
locale(xfce4-systemload-plugin:pl) \
locale(xfce4-systemload-plugin:pt) \
locale(xfce4-systemload-plugin:pt_BR) \
locale(xfce4-systemload-plugin:ru) \
locale(xfce4-systemload-plugin:sk) \
locale(xfce4-systemload-plugin:sl) \
locale(xfce4-systemload-plugin:sq) \
locale(xfce4-systemload-plugin:sr) \
locale(xfce4-systemload-plugin:sv) \
locale(xfce4-systemload-plugin:th) \
locale(xfce4-systemload-plugin:tr) \
locale(xfce4-systemload-plugin:ug) \
locale(xfce4-systemload-plugin:uk) \
locale(xfce4-systemload-plugin:vi) \
locale(xfce4-systemload-plugin:zh_CN) \
locale(xfce4-systemload-plugin:zh_TW) \
xfce4-panel-plugin-systemload-lang \
xfce4-systemload-plugin-lang \
xfce4-systemload-plugin-lang-all"

RDEPENDS:${PN} += "xfce4-systemload-plugin"

inherit rpm
