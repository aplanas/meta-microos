SUMMARY = "Metapackage to pull in all of python-gobject's packages"
DESCRIPTION = "This package contains files required to build wrappers for gobject \
addon libraries such as pygtk."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python310-gobject-devel-3.44.1-2.1.aarch64.rpm"
RPM_HASH = "7c190d20aeed926da889659f4be830ba88c878ab96b9e210b51a2603da4a62c99238ba861a09095b4dacc9d67093745a72ccdf314ed6432a20f44fa0847ebe2d"

RPROVIDES:${PN} += "python310-gobject-devel"

RDEPENDS:${PN} += "python310-devel \
python310-gobject \
python310-gobject-Gdk \
python310-gobject-cairo \
python310-gobject-common-devel"

inherit rpm
