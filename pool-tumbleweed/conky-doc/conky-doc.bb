SUMMARY = "Documentation for conky"
DESCRIPTION = "Conky is an configurable system monitor for X. \
 \
This package provides additional documentation about conky."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.13.1"

RPM_NAME = "conky-doc-1.13.1-3.3.aarch64.rpm"
RPM_HASH = "eaa1ba89f71e387ef119989a6325eeed4544a9ec34b0a0f032756c8b98e655cfc0da21f4736d10f6f485911124333e3206e6da141818b49c70f22468d7e522c0"

RPROVIDES:${PN} += "conky-doc"

RDEPENDS:${PN} += ""

inherit rpm
