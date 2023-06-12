SUMMARY = "Translations for package gstreamer"
DESCRIPTION = "Provides translations for the 'gstreamer' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-lang-1.22.3-1.1.noarch.rpm"
RPM_HASH = "70dfe55e02763f921c1ded813e070895ed80a7e18755d08632f229151111da738cb3e2a15f138e510baade090b688dc85cd2351f400e8d000fe0f432e0ed6a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gstreamer-lang \
gstreamer-lang-all \
locale(gstreamer:af) \
locale(gstreamer:ast) \
locale(gstreamer:az) \
locale(gstreamer:be) \
locale(gstreamer:bg) \
locale(gstreamer:ca) \
locale(gstreamer:cs) \
locale(gstreamer:da) \
locale(gstreamer:de) \
locale(gstreamer:el) \
locale(gstreamer:en_GB) \
locale(gstreamer:eo) \
locale(gstreamer:es) \
locale(gstreamer:eu) \
locale(gstreamer:fi) \
locale(gstreamer:fr) \
locale(gstreamer:fur) \
locale(gstreamer:gl) \
locale(gstreamer:hr) \
locale(gstreamer:hu) \
locale(gstreamer:id) \
locale(gstreamer:it) \
locale(gstreamer:ja) \
locale(gstreamer:ka) \
locale(gstreamer:ko) \
locale(gstreamer:lt) \
locale(gstreamer:nb) \
locale(gstreamer:nl) \
locale(gstreamer:pl) \
locale(gstreamer:pt_BR) \
locale(gstreamer:ro) \
locale(gstreamer:ru) \
locale(gstreamer:sk) \
locale(gstreamer:sl) \
locale(gstreamer:sq) \
locale(gstreamer:sr) \
locale(gstreamer:sv) \
locale(gstreamer:tr) \
locale(gstreamer:uk) \
locale(gstreamer:vi) \
locale(gstreamer:zh_CN) \
locale(gstreamer:zh_TW)"
RDEPENDS:${PN} += "gstreamer"

inherit rpm
