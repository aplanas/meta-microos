SUMMARY = "Settings Manager for Compiz (CCSM)"
DESCRIPTION = "Compiz Config and Settings tool (CCSM)."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compizconfig-settings-manager-0.8.18-2.10.noarch.rpm"
RPM_HASH = "9c98d62f45c72901d11684a0b423d2ae0d36b428bcff265e0ca47c12ca9bd00e89089b4337764d5a11d444d84f773a76c94950fb59fa7f8e66f686c1a44fb8a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(ccsm.desktop) \
ccsm \
compizconfig-settings-manager \
metainfo() \
metainfo(ccsm.appdata.xml)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-ccm \
typelib(GLib) \
typelib(Gdk) \
typelib(Gio) \
typelib(Gtk) \
typelib(Pango) \
typelib(PangoCairo)"

inherit rpm
