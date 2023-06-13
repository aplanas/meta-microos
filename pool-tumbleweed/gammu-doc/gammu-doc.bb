SUMMARY = "Documentation of Gammu"
DESCRIPTION = "This package contains the manual for gammu."
LICENSE = "GPL-2.0-only"

PV = "1.42.0"

RPM_NAME = "gammu-doc-1.42.0-4.6.noarch.rpm"
RPM_HASH = "6c5c3eccfa804808cfd7317b155d9f1c91cd638c86996a625b9cdd98d05ea8f03faf5169f9e00ee6001a8626bc7a7427614ea875cb7c0bdfa1efa1b0e2555a56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gammu-doc"

RDEPENDS:${PN} += ""

inherit rpm
