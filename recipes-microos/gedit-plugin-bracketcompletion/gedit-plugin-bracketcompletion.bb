SUMMARY = "Gedit bracketcompletion plugin"
DESCRIPTION = "The gedit bracketcompletion plugin."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-bracketcompletion-44.1-1.3.aarch64.rpm"
RPM_HASH = "93d60c987596bd473e0f9cf3d88aa9fa197a71405c0882eea313c73b9e97934511a75e8648dfc079e2545eecdf04029a95e030b5d85b0b39b9ad969c8d59815a"

RPROVIDES:${PN} += "gedit-plugin-bracketcompletion \
gedit-plugin-bracketcompletion(aarch-64) \
gedit-plugins:/usr/lib64/gedit/plugins/bracketcompletion.plugin \
metainfo() \
metainfo(gedit-bracketcompletion.metainfo.xml)"
RDEPENDS:${PN} += "gedit-plugins-data \
typelib(GObject) \
typelib(Gdk) \
typelib(Gedit) \
typelib(Gtk) \
typelib(Peas)"

inherit rpm
