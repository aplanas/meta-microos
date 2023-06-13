SUMMARY = "Documentation for adaptx"
DESCRIPTION = "This package contains the documentation for AdaptX."
LICENSE = "BSD-3-Clause"

PV = "0.9.13"

RPM_NAME = "adaptx-doc-0.9.13-136.6.noarch.rpm"
RPM_HASH = "f2d8b304eafeb7b11319e7fdef646da4267d4e8042fcb19e4dd5690f331c7b63a62970a22fa348cf8e8a2191ff643be9b5ceb7251c54fc24f10f694a8e75368a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adaptx-doc"

RDEPENDS:${PN} += ""

inherit rpm
