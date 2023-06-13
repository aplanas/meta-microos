SUMMARY = "Translations for package pulseaudio"
DESCRIPTION = "Provides translations for the 'pulseaudio' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-lang-16.1-3.1.noarch.rpm"
RPM_HASH = "4b208f0f94c2634944b6f1068b8143989d38ff58d3c72eeb2a1df2a614cfeb24d7355d606ba7975bdb122b4ae61f5f5dada7b3dc9ec15d647a78d8ff4f3d859d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pulseaudio:af) \
locale(pulseaudio:as) \
locale(pulseaudio:be) \
locale(pulseaudio:bg) \
locale(pulseaudio:bn_IN) \
locale(pulseaudio:ca) \
locale(pulseaudio:cs) \
locale(pulseaudio:da) \
locale(pulseaudio:de) \
locale(pulseaudio:de_CH) \
locale(pulseaudio:el) \
locale(pulseaudio:eo) \
locale(pulseaudio:es) \
locale(pulseaudio:fi) \
locale(pulseaudio:fr) \
locale(pulseaudio:gl) \
locale(pulseaudio:gu) \
locale(pulseaudio:he) \
locale(pulseaudio:hi) \
locale(pulseaudio:hr) \
locale(pulseaudio:hu) \
locale(pulseaudio:id) \
locale(pulseaudio:it) \
locale(pulseaudio:ja) \
locale(pulseaudio:ka) \
locale(pulseaudio:kk) \
locale(pulseaudio:kn) \
locale(pulseaudio:ko) \
locale(pulseaudio:lt) \
locale(pulseaudio:ml) \
locale(pulseaudio:mr) \
locale(pulseaudio:nl) \
locale(pulseaudio:nn) \
locale(pulseaudio:oc) \
locale(pulseaudio:or) \
locale(pulseaudio:pa) \
locale(pulseaudio:pl) \
locale(pulseaudio:pt) \
locale(pulseaudio:pt_BR) \
locale(pulseaudio:ru) \
locale(pulseaudio:si) \
locale(pulseaudio:sk) \
locale(pulseaudio:sr) \
locale(pulseaudio:sr@latin) \
locale(pulseaudio:sv) \
locale(pulseaudio:ta) \
locale(pulseaudio:te) \
locale(pulseaudio:tr) \
locale(pulseaudio:uk) \
locale(pulseaudio:zh_CN) \
locale(pulseaudio:zh_TW) \
pulseaudio-lang \
pulseaudio-lang-all"

RDEPENDS:${PN} += "pulseaudio"

inherit rpm
