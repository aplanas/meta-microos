SUMMARY = "Translations for package gstreamer-plugins-base"
DESCRIPTION = "Provides translations for the 'gstreamer-plugins-base' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-base-lang-1.22.3-1.1.noarch.rpm"
RPM_HASH = "620fdd445de59c6793ae473325acffec7280400f484ac319e8d012fd819d0208038d6588aa80b5928ec03211e3888486707355e11e5d495386abfb7e1fd0f17d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gstreamer-plugins-base-lang \
gstreamer-plugins-base-lang-all \
locale(gstreamer-plugins-base:af) \
locale(gstreamer-plugins-base:az) \
locale(gstreamer-plugins-base:bg) \
locale(gstreamer-plugins-base:ca) \
locale(gstreamer-plugins-base:cs) \
locale(gstreamer-plugins-base:da) \
locale(gstreamer-plugins-base:de) \
locale(gstreamer-plugins-base:el) \
locale(gstreamer-plugins-base:en_GB) \
locale(gstreamer-plugins-base:eo) \
locale(gstreamer-plugins-base:es) \
locale(gstreamer-plugins-base:eu) \
locale(gstreamer-plugins-base:fi) \
locale(gstreamer-plugins-base:fr) \
locale(gstreamer-plugins-base:fur) \
locale(gstreamer-plugins-base:gl) \
locale(gstreamer-plugins-base:hr) \
locale(gstreamer-plugins-base:hu) \
locale(gstreamer-plugins-base:id) \
locale(gstreamer-plugins-base:it) \
locale(gstreamer-plugins-base:ja) \
locale(gstreamer-plugins-base:ka) \
locale(gstreamer-plugins-base:lt) \
locale(gstreamer-plugins-base:lv) \
locale(gstreamer-plugins-base:nb) \
locale(gstreamer-plugins-base:nl) \
locale(gstreamer-plugins-base:or) \
locale(gstreamer-plugins-base:pl) \
locale(gstreamer-plugins-base:pt_BR) \
locale(gstreamer-plugins-base:ro) \
locale(gstreamer-plugins-base:ru) \
locale(gstreamer-plugins-base:sk) \
locale(gstreamer-plugins-base:sl) \
locale(gstreamer-plugins-base:sq) \
locale(gstreamer-plugins-base:sr) \
locale(gstreamer-plugins-base:sv) \
locale(gstreamer-plugins-base:tr) \
locale(gstreamer-plugins-base:uk) \
locale(gstreamer-plugins-base:vi) \
locale(gstreamer-plugins-base:zh_CN)"
RDEPENDS:${PN} += "gstreamer-plugins-base"

inherit rpm
