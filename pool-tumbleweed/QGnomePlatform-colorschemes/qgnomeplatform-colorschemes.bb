SUMMARY = "Color schemes for QGnomePlatform"
DESCRIPTION = "QGnomePlatform is a Qt Platform Theme designed to use as many of the GNOME \
settings as possible in unmodified Qt applications. It allows Qt applications \
to fit into the environment as well as possible."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & LGPL-2.1-or-later"

PV = "0.9.1"

RPM_NAME = "QGnomePlatform-colorschemes-0.9.1-1.2.noarch.rpm"
RPM_HASH = "3085c823f7a460f46c724941baa4e5ee6323b0986ac4f6db29e0c6aa4ffa7077d509d57b5e7bccdd07bc0e62d2c02e229ca26bc4464a6c9ab840227839d88f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "QGnomePlatform-colorschemes"

RDEPENDS:${PN} += ""

inherit rpm
