SUMMARY = "API documentation for Nuspell"
DESCRIPTION = "This package provides API documentation for Nuspell."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.2"

RPM_NAME = "nuspell-doc-5.1.2-1.5.noarch.rpm"
RPM_HASH = "70e6c84d2df9bd736afc2847515f580ae90a0bd9d83c46e3f7b3c12e418594960626872cf1dace3a94168c2dbbd70a94b7a5df9978b84b9276af910c1be1a7e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nuspell-doc"

RDEPENDS:${PN} += ""

inherit rpm
