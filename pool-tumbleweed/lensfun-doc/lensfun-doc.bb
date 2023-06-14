SUMMARY = "Documentation for lensfun"
DESCRIPTION = "Documentation and manual files for the lensfun library/database."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "lensfun-doc-0.3.3-1.7.aarch64.rpm"
RPM_HASH = "450767e70df861faf8037cc2a21937fccb02e3a780b20749fde6252c094c63b70695cd199a7b7d8fcbe5d331bf3d76df05ce67fc085701ac4dca2ac5a2edb9c2"

RPROVIDES:${PN} += "lensfun-doc"

RDEPENDS:${PN} += "lensfun-data"

inherit rpm
