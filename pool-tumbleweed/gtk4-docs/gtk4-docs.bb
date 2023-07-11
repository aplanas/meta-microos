SUMMARY = "Developer documentation for GTK"
DESCRIPTION = "This package contains developer documentation for version 4 of the GTK \
widget toolkit."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.4"

RPM_NAME = "gtk4-docs-4.10.4-1.2.noarch.rpm"
RPM_HASH = "6237d8a623065ce5e2be0a1e9f61a3954818d55613ed26efc454875d55aecfdef66f361d84be7445e40684667b664120b5ca40d67834fc81b8c314a790b9a2a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-docs"

RDEPENDS:${PN} += ""

inherit rpm
