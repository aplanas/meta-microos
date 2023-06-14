SUMMARY = "Documentation for conky"
DESCRIPTION = "Conky is an configurable system monitor for X. \
 \
This package provides additional documentation about conky."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.13.1"

RPM_NAME = "conky-doc-1.13.1-3.1.aarch64.rpm"
RPM_HASH = "ebaa4345ea309e418e5555cc7c4a36f8719e681936260a2711317742cb1333429995c7f9228b03fd0ef2a637edd5984ced0deaf4bd212e4708d51830d0439029"

RPROVIDES:${PN} += "conky-doc"

RDEPENDS:${PN} += ""

inherit rpm
