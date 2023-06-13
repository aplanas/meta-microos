SUMMARY = "Translations for package gstreamer-plugins-ugly"
DESCRIPTION = "Provides translations for the 'gstreamer-plugins-ugly' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-ugly-lang-1.22.3-1.1.noarch.rpm"
RPM_HASH = "a5aadb011f4cca2abc003f53c0128debf549fde44e922287102b7fdcad3dd83efd28332d4c560b9f2c7da4ef6bed766b4343a856391f7811e7464403d0ad16f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gstreamer-plugins-ugly-lang \
gstreamer-plugins-ugly-lang-all \
locale(gstreamer-plugins-ugly:af) \
locale(gstreamer-plugins-ugly:ast) \
locale(gstreamer-plugins-ugly:az) \
locale(gstreamer-plugins-ugly:bg) \
locale(gstreamer-plugins-ugly:ca) \
locale(gstreamer-plugins-ugly:cs) \
locale(gstreamer-plugins-ugly:da) \
locale(gstreamer-plugins-ugly:de) \
locale(gstreamer-plugins-ugly:el) \
locale(gstreamer-plugins-ugly:en_GB) \
locale(gstreamer-plugins-ugly:eo) \
locale(gstreamer-plugins-ugly:es) \
locale(gstreamer-plugins-ugly:eu) \
locale(gstreamer-plugins-ugly:fi) \
locale(gstreamer-plugins-ugly:fr) \
locale(gstreamer-plugins-ugly:fur) \
locale(gstreamer-plugins-ugly:gl) \
locale(gstreamer-plugins-ugly:hr) \
locale(gstreamer-plugins-ugly:hu) \
locale(gstreamer-plugins-ugly:id) \
locale(gstreamer-plugins-ugly:it) \
locale(gstreamer-plugins-ugly:ja) \
locale(gstreamer-plugins-ugly:ka) \
locale(gstreamer-plugins-ugly:lt) \
locale(gstreamer-plugins-ugly:lv) \
locale(gstreamer-plugins-ugly:ms) \
locale(gstreamer-plugins-ugly:nb) \
locale(gstreamer-plugins-ugly:nl) \
locale(gstreamer-plugins-ugly:or) \
locale(gstreamer-plugins-ugly:pl) \
locale(gstreamer-plugins-ugly:pt_BR) \
locale(gstreamer-plugins-ugly:ro) \
locale(gstreamer-plugins-ugly:ru) \
locale(gstreamer-plugins-ugly:sk) \
locale(gstreamer-plugins-ugly:sl) \
locale(gstreamer-plugins-ugly:sq) \
locale(gstreamer-plugins-ugly:sr) \
locale(gstreamer-plugins-ugly:sv) \
locale(gstreamer-plugins-ugly:ta) \
locale(gstreamer-plugins-ugly:tr) \
locale(gstreamer-plugins-ugly:uk) \
locale(gstreamer-plugins-ugly:vi) \
locale(gstreamer-plugins-ugly:zh_CN) \
locale(gstreamer-plugins-ugly:zh_TW)"

RDEPENDS:${PN} += "gstreamer-plugins-ugly"

inherit rpm
