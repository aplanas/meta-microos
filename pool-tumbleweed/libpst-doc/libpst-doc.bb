SUMMARY = "Documentation for the pst utilities in html format"
DESCRIPTION = "The libpst-doc package contains the html documentation for the pst \
utilities.  You do not need to install it if you just want to use \
the libpst utilities."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.76"

RPM_NAME = "libpst-doc-0.6.76-1.3.noarch.rpm"
RPM_HASH = "33427ff561cee25f8496537d62a9a4220eae7fe035d7cadebb08c957d0d97b86525672d0d4f54812f8bb41bddb79f211d602d57dd2e85bc29f4232589dae44cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpst-doc"
RDEPENDS:${PN} += ""

inherit rpm
