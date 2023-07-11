SUMMARY = "m4 macros for pkgconf"
DESCRIPTION = "This package includes m4 macros used to support PKG_CHECK_MODULES \
when using pkgconf with autotools."
LICENSE = "GPL-2.0-or-later-with-Autoconf-exception-2.0"

PV = "1.8.0"

RPM_NAME = "pkgconf-m4-1.8.0-2.5.noarch.rpm"
RPM_HASH = "39205daf0c619e37053d06d1d2d2b87fc1408531a5cdb119e07725a9f539c1656dc61b840485f9036cdad7d88b0ebe7390b84db4fc2c2218332bed12263c46e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconf-m4"

RDEPENDS:${PN} += ""

inherit rpm
