SUMMARY = "Translations for package flacon"
DESCRIPTION = "Provides translations for the 'flacon' package."
LICENSE = "LGPL-2.1-or-later"

PV = "11.1.0"

RPM_NAME = "flacon-lang-11.1.0-1.1.noarch.rpm"
RPM_HASH = "904b83cabaa5592887a08042b098696d35e0cce212bd50970e57445ca46dc1d06e78c4c8fecb648f69bb1cfd24e1c5a8016779581721ed151eb118575242a0cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flacon-lang flacon-lang-all"
RDEPENDS:${PN} += "flacon"

inherit rpm
