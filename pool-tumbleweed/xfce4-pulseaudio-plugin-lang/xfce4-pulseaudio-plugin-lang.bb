SUMMARY = "Translations for package xfce4-pulseaudio-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-pulseaudio-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.6"

RPM_NAME = "xfce4-pulseaudio-plugin-lang-0.4.6-1.1.noarch.rpm"
RPM_HASH = "dcc8f78e20c1fc71377fcf5fbc263716e3a59266c3fe03aff4d56864099d67d58652f9a0268d99c308700a3086e4f624a0093a57c25b3fe65e5570ac1c99c43c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-pulseaudio-plugin:ar) \
locale(xfce4-pulseaudio-plugin:be) \
locale(xfce4-pulseaudio-plugin:bg) \
locale(xfce4-pulseaudio-plugin:ca) \
locale(xfce4-pulseaudio-plugin:cs) \
locale(xfce4-pulseaudio-plugin:da) \
locale(xfce4-pulseaudio-plugin:de) \
locale(xfce4-pulseaudio-plugin:el) \
locale(xfce4-pulseaudio-plugin:en_AU) \
locale(xfce4-pulseaudio-plugin:en_CA) \
locale(xfce4-pulseaudio-plugin:es) \
locale(xfce4-pulseaudio-plugin:eu) \
locale(xfce4-pulseaudio-plugin:fi) \
locale(xfce4-pulseaudio-plugin:fr) \
locale(xfce4-pulseaudio-plugin:ga) \
locale(xfce4-pulseaudio-plugin:gl) \
locale(xfce4-pulseaudio-plugin:he) \
locale(xfce4-pulseaudio-plugin:hr) \
locale(xfce4-pulseaudio-plugin:hu) \
locale(xfce4-pulseaudio-plugin:id) \
locale(xfce4-pulseaudio-plugin:is) \
locale(xfce4-pulseaudio-plugin:it) \
locale(xfce4-pulseaudio-plugin:ja) \
locale(xfce4-pulseaudio-plugin:kk) \
locale(xfce4-pulseaudio-plugin:ko) \
locale(xfce4-pulseaudio-plugin:lt) \
locale(xfce4-pulseaudio-plugin:ms) \
locale(xfce4-pulseaudio-plugin:nb) \
locale(xfce4-pulseaudio-plugin:nl) \
locale(xfce4-pulseaudio-plugin:oc) \
locale(xfce4-pulseaudio-plugin:pl) \
locale(xfce4-pulseaudio-plugin:pt) \
locale(xfce4-pulseaudio-plugin:pt_BR) \
locale(xfce4-pulseaudio-plugin:ru) \
locale(xfce4-pulseaudio-plugin:sk) \
locale(xfce4-pulseaudio-plugin:sl) \
locale(xfce4-pulseaudio-plugin:sq) \
locale(xfce4-pulseaudio-plugin:sr) \
locale(xfce4-pulseaudio-plugin:sv) \
locale(xfce4-pulseaudio-plugin:th) \
locale(xfce4-pulseaudio-plugin:tr) \
locale(xfce4-pulseaudio-plugin:uk) \
locale(xfce4-pulseaudio-plugin:zh_CN) \
locale(xfce4-pulseaudio-plugin:zh_TW) \
xfce4-panel-plugin-pulseaudio-lang \
xfce4-pulseaudio-plugin-lang \
xfce4-pulseaudio-plugin-lang-all"

RDEPENDS:${PN} += "xfce4-pulseaudio-plugin"

inherit rpm
