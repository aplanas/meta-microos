SUMMARY = "Documentation for the libspandsp API"
DESCRIPTION = "This package contains documentation for the libspandsp API."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.0.0+g21"

RPM_NAME = "spandsp-doc-3.0.0+g21-1.1.noarch.rpm"
RPM_HASH = "4ac2f55d819a2140d852e3b9f0834a8e59026685fc061dd1b66ba45afc0bf06b2e27e9056b8907485e1c5194306adf8909a6762ada28d22b4754e3fba7a5bf91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spandsp-doc"

RDEPENDS:${PN} += ""

inherit rpm
