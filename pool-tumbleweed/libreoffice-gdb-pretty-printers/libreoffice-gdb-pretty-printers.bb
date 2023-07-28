SUMMARY = "Additional support for debugging with gdb"
DESCRIPTION = "This package provides gdb pretty printers for package libreoffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-gdb-pretty-printers-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "89db2e6b352d5469c28cafe6b194e9c92cabd3956b23241c348f07ebe15aea74b3f8e8d4dd83400cd43f7c9ce60a28fd7a1b5326d48671635acceef5b5fa030f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-gdb-pretty-printers"

RDEPENDS:${PN} += "gdb \
libreoffice \
python3-six"

inherit rpm
