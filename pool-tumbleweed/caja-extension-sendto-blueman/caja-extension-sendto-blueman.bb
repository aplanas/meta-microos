SUMMARY = "A sendto integration for Caja"
DESCRIPTION = "This package add sendto integration for Caja."
LICENSE = "GPL-3.0-only"

PV = "2.3.5"

RPM_NAME = "caja-extension-sendto-blueman-2.3.5-1.3.noarch.rpm"
RPM_HASH = "3871f7fba0acf7c25ad2a6cf5e1d1b3a307342319c165d924fc18ecf3bda8ae5ea367ef9eb264e22ed829ba68d8013890997629cbaa9eb807e28a707c6f6ff18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-sendto-blueman"
RDEPENDS:${PN} += "blueman \
typelib(Caja) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
