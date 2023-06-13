SUMMARY = "GLib-schema org.gnome.nm-applet.eap"
DESCRIPTION = "The glib-schema allows libnma to be configured wia dconf \
 \
It is required by libnma"
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-glib-schema-1.10.6-1.3.noarch.rpm"
RPM_HASH = "6589381f07a11d7d626a6de38856659cb0a8c399fe04c0c02d49318584a78e10a9116fbcc0881ee1261f38f462f5ccce49c93ae61c42fca344da70b68c1c4679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libnma-glib-schema"

RDEPENDS:${PN} += ""

inherit rpm
