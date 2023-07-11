SUMMARY = "Documentation for the pst utilities in html format"
DESCRIPTION = "The libpst-doc package contains the html documentation for the pst \
utilities.  You do not need to install it if you just want to use \
the libpst utilities."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.76"

RPM_NAME = "libpst-doc-0.6.76-1.4.noarch.rpm"
RPM_HASH = "206b3599ef5b02b95f0558c46a78e602cc5f908b9d7160515c52c4079acbcc44de2d55a7000836bd81c4220fb177e4de459b14dd3ada9c00d8b54e6af16a8836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpst-doc"

RDEPENDS:${PN} += ""

inherit rpm
