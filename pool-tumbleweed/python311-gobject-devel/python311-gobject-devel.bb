SUMMARY = "Metapackage to pull in all of python-gobject's packages"
DESCRIPTION = "This package contains files required to build wrappers for gobject \
addon libraries such as pygtk."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python311-gobject-devel-3.44.1-2.1.aarch64.rpm"
RPM_HASH = "d2b88b615200631803e4e6c6bf52759e553a8d2e46684fb35e35dbb88f74ecafcd0af4820b1871dbc8793e3c9518b4af66d23028eebaa12140c6905c7063d8e6"

RPROVIDES:${PN} += "python3-gobject-devel \
python311-gobject-devel"

RDEPENDS:${PN} += "python311-devel \
python311-gobject \
python311-gobject-Gdk \
python311-gobject-cairo \
python311-gobject-common-devel"

inherit rpm
