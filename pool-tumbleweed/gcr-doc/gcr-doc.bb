SUMMARY = "Documentation for gcr"
DESCRIPTION = "This packages provides the documentation for various gcr packages."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "gcr-doc-4.1.0-1.1.noarch.rpm"
RPM_HASH = "433c57c098a046281b92064ccce34170bbbc82b6dc0930a212a244069392ae91975aaef14efc4c151eccdac3a09f03b8a9a5f98a78a06c1945f4e9102a878569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcr-doc"

RDEPENDS:${PN} += ""

inherit rpm
