SUMMARY = "Translations for package xfce4-cpugraph-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-cpugraph-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.7"

RPM_NAME = "xfce4-cpugraph-plugin-lang-1.2.7-1.3.noarch.rpm"
RPM_HASH = "dfec28cbf344a7a0d478ba9ee928bc6d3758dea54bfeab17bae37cc6f32e640df537fcf18d61dde2d04dc6c4d0972da7737a8629c35533c59c8b95ded3042db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-cpugraph-plugin:ar) \
locale(xfce4-cpugraph-plugin:be) \
locale(xfce4-cpugraph-plugin:bg) \
locale(xfce4-cpugraph-plugin:ca) \
locale(xfce4-cpugraph-plugin:cs) \
locale(xfce4-cpugraph-plugin:da) \
locale(xfce4-cpugraph-plugin:de) \
locale(xfce4-cpugraph-plugin:el) \
locale(xfce4-cpugraph-plugin:en_AU) \
locale(xfce4-cpugraph-plugin:en_GB) \
locale(xfce4-cpugraph-plugin:es) \
locale(xfce4-cpugraph-plugin:et) \
locale(xfce4-cpugraph-plugin:eu) \
locale(xfce4-cpugraph-plugin:fi) \
locale(xfce4-cpugraph-plugin:fr) \
locale(xfce4-cpugraph-plugin:gl) \
locale(xfce4-cpugraph-plugin:he) \
locale(xfce4-cpugraph-plugin:hr) \
locale(xfce4-cpugraph-plugin:hu) \
locale(xfce4-cpugraph-plugin:id) \
locale(xfce4-cpugraph-plugin:is) \
locale(xfce4-cpugraph-plugin:it) \
locale(xfce4-cpugraph-plugin:ja) \
locale(xfce4-cpugraph-plugin:ko) \
locale(xfce4-cpugraph-plugin:lt) \
locale(xfce4-cpugraph-plugin:lv) \
locale(xfce4-cpugraph-plugin:ms) \
locale(xfce4-cpugraph-plugin:nb) \
locale(xfce4-cpugraph-plugin:nl) \
locale(xfce4-cpugraph-plugin:oc) \
locale(xfce4-cpugraph-plugin:pa) \
locale(xfce4-cpugraph-plugin:pl) \
locale(xfce4-cpugraph-plugin:pt) \
locale(xfce4-cpugraph-plugin:pt_BR) \
locale(xfce4-cpugraph-plugin:ro) \
locale(xfce4-cpugraph-plugin:ru) \
locale(xfce4-cpugraph-plugin:sk) \
locale(xfce4-cpugraph-plugin:sl) \
locale(xfce4-cpugraph-plugin:sq) \
locale(xfce4-cpugraph-plugin:sr) \
locale(xfce4-cpugraph-plugin:sv) \
locale(xfce4-cpugraph-plugin:th) \
locale(xfce4-cpugraph-plugin:tr) \
locale(xfce4-cpugraph-plugin:ug) \
locale(xfce4-cpugraph-plugin:uk) \
locale(xfce4-cpugraph-plugin:vi) \
locale(xfce4-cpugraph-plugin:zh_CN) \
locale(xfce4-cpugraph-plugin:zh_TW) \
xfce4-cpugraph-plugin-lang \
xfce4-cpugraph-plugin-lang-all \
xfce4-panel-plugin-cpugraph-lang"
RDEPENDS:${PN} += "xfce4-cpugraph-plugin"

inherit rpm
