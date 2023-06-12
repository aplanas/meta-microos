SUMMARY = "GNOME Platform Documentation"
DESCRIPTION = "This package contains documents that are useful for GNOME developers."
LICENSE = "CC-BY-SA-4.0 & GFDL-1.1-only"

PV = "40.3"

RPM_NAME = "gnome-devel-docs-40.3-1.6.noarch.rpm"
RPM_HASH = "52c7b0aa0920d980668dfc858f720ced8df31a30cd0e47434a94c9ff70208a2f6ff07ae410879e26d6bfe4e3ef51af81aa4555a6ca7cf0d788038ec641bf4110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-devel-docs"
RDEPENDS:${PN} += ""

inherit rpm
