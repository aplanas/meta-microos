SUMMARY = "Geany documentation"
DESCRIPTION = "Geany's developers documentation"
LICENSE = "GPL-2.0-or-later"

PV = "1.38"

RPM_NAME = "geany-doc-1.38-3.8.aarch64.rpm"
RPM_HASH = "9632db8342e95db79c48d40c21633c9d7e96f2362bcee9adec2e8053a87724b49cda1dd078180b1f70d21538c5d83b225e62469f7a9d4b6be90359fe5d0ff315"

RPROVIDES:${PN} += "geany-doc"

RDEPENDS:${PN} += "geany"

inherit rpm
