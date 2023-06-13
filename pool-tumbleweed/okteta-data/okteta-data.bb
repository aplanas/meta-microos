SUMMARY = "Hex Editor data files"
DESCRIPTION = "Data files used by Okteta/libKasten, e.g. structures definitions."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.10"

RPM_NAME = "okteta-data-0.26.10-1.3.noarch.rpm"
RPM_HASH = "399a84a19b924ba94318f30cdf94856a09a9b1f9987054cbbe15ff97070551082640b323fa9aaed1fda736136ac71fe1b3ffd231bd60d28553bdd39e1236d0c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "okteta-data"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
