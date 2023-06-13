SUMMARY = "Translations for package gnome-subtitles"
DESCRIPTION = "Provides translations for the 'gnome-subtitles' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.2"

RPM_NAME = "gnome-subtitles-lang-1.7.2-1.7.noarch.rpm"
RPM_HASH = "ccd8f4111fc9158d726212c070c5d3bd4b58276cd6dc900b775d10337d269a2b3d68cddd82d45a90adadd42cd62e229f2693d486f7c68f3a3c3159321f4107ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-subtitles-lang \
gnome-subtitles-lang-all \
locale(gnome-subtitles:ar) \
locale(gnome-subtitles:bg) \
locale(gnome-subtitles:bs) \
locale(gnome-subtitles:ca) \
locale(gnome-subtitles:ca@valencia) \
locale(gnome-subtitles:cs) \
locale(gnome-subtitles:da) \
locale(gnome-subtitles:de) \
locale(gnome-subtitles:dz) \
locale(gnome-subtitles:el) \
locale(gnome-subtitles:en_GB) \
locale(gnome-subtitles:es) \
locale(gnome-subtitles:eu) \
locale(gnome-subtitles:fi) \
locale(gnome-subtitles:fr) \
locale(gnome-subtitles:gl) \
locale(gnome-subtitles:he) \
locale(gnome-subtitles:hu) \
locale(gnome-subtitles:id) \
locale(gnome-subtitles:is) \
locale(gnome-subtitles:it) \
locale(gnome-subtitles:nb) \
locale(gnome-subtitles:nl) \
locale(gnome-subtitles:oc) \
locale(gnome-subtitles:pa) \
locale(gnome-subtitles:pl) \
locale(gnome-subtitles:pt) \
locale(gnome-subtitles:pt_BR) \
locale(gnome-subtitles:ro) \
locale(gnome-subtitles:ru) \
locale(gnome-subtitles:sk) \
locale(gnome-subtitles:sl) \
locale(gnome-subtitles:sr) \
locale(gnome-subtitles:sr@latin) \
locale(gnome-subtitles:sv) \
locale(gnome-subtitles:tr) \
locale(gnome-subtitles:uk) \
locale(gnome-subtitles:zh_CN) \
locale(gnome-subtitles:zh_HK) \
locale(gnome-subtitles:zh_TW)"

RDEPENDS:${PN} += "gnome-subtitles"

inherit rpm
