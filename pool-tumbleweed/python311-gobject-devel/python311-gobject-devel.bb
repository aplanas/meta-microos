SUMMARY = "Metapackage to pull in all of python-gobject's packages"
DESCRIPTION = "This package contains files required to build wrappers for gobject \
addon libraries such as pygtk."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python311-gobject-devel-3.44.1-1.2.aarch64.rpm"
RPM_HASH = "69c9bc997d299d3b931111710822cfeeefeaa3e762eae2186194e1d1fb5d32c62047016583e3857b8fb0943827ee92d76430fe412ae07e05e586117390645167"

RPROVIDES:${PN} += "python311-gobject-devel"

RDEPENDS:${PN} += "python311-devel \
python311-gobject \
python311-gobject-Gdk \
python311-gobject-cairo \
python311-gobject-common-devel"

inherit rpm
