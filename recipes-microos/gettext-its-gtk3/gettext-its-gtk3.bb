SUMMARY = "International Tag Set for GTK+ 3"
DESCRIPTION = "This package enhances gettext with an International Tag Set for GTK+ 3"
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "gettext-its-gtk3-3.24.37+70-1.1.noarch.rpm"
RPM_HASH = "e04a8af6e67898a758c22cfa0e3fe3fbd4b8116ba485c26f584da112f4c3c2e63cd80a35eb4353a38e88ed2a9b0d5f666be91b946e5e7deb92fecf3f2a100d66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gettext-its-gtk3"
RDEPENDS:${PN} += ""

inherit rpm
