SUMMARY = "GIMP extensions for Inkscape"
DESCRIPTION = "The GIMP import and export extensions for Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-gimp-1.2.2-3.4.aarch64.rpm"
RPM_HASH = "a6b3f3dcef3f6bfd4481242ffbc06bfe405e3ede3ab6a190e32df52fb7d82abe635ab405fc9f86f4b7e263fb7527eb3864e42e0e89ad400da080dd8ccedf02e5"

RPROVIDES:${PN} += "inkscape-extensions-gimp"

RDEPENDS:${PN} += "gimp \
inkscape \
inkscape-extensions-extra"

inherit rpm
