SUMMARY = "Documentation for gcr"
DESCRIPTION = "This packages provides the documentation for various gcr packages."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "gcr-doc-4.1.0-1.2.noarch.rpm"
RPM_HASH = "5e0b69a0df2c423d8fffd9376e344139d51c182ead6091a98e736aa0dbd4052c6fddc7356d2a848cc752a71bb6d09ce78a998721e1b29abfb5caec4b3c4d2e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcr-doc"

RDEPENDS:${PN} += ""

inherit rpm
