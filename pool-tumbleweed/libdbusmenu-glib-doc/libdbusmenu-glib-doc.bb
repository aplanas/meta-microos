SUMMARY = "Documentation for libdbusmenu-glib4"
DESCRIPTION = "This package includes the documentation for the dbusmenu-glib library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-glib-doc-16.04.0-9.3.noarch.rpm"
RPM_HASH = "efe078df715565af1c6cbb0fbd6d2dcd17594c6427aec85a2bb52521c86ce4e2cf5f6910b7a8bbebf9ac7d0b96c0e5b6799b472bcfcaf76f343e51cc355e56e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdbusmenu-glib-doc"
RDEPENDS:${PN} += ""

inherit rpm
