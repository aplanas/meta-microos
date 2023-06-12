SUMMARY = "Mist Theme for GTK+ 2"
DESCRIPTION = "This package provides the Mist GTK+ 2 theme."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-mist-2.20.2-19.42.noarch.rpm"
RPM_HASH = "a75baac3212d7654a14e7a65e7ef3edb4898b126f68c77ec66d62da2b27a41f7dbf046d093d548d627642bcd922cc97f943a45ae48c521e369acb3cca7ac686c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-mist"
RDEPENDS:${PN} += "gtk2-engine-mist"

inherit rpm
