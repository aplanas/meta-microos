SUMMARY = "Documentation for texlive-emulateapj"
DESCRIPTION = "This package includes the documentation for texlive-emulateapj"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn28469"

RPM_NAME = "texlive-emulateapj-doc-2023.209.svn28469-54.1.noarch.rpm"
RPM_HASH = "da1cc0414ce6abd1f527fffa5615f25f8e2c72a9be943992764eb65c968be37928fc834fed3a6515a75254db19a6b85fe2e078da9e8121f0bda07c8a8bcdce13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emulateapj-doc"

RDEPENDS:${PN} += ""

inherit rpm
