SUMMARY = "Documentation for texlive-leaflet"
DESCRIPTION = "This package includes the documentation for texlive-leaflet"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1asvn56878"

RPM_NAME = "texlive-leaflet-doc-2023.209.2.1asvn56878-55.1.noarch.rpm"
RPM_HASH = "a5c63f6d50742ac45cef54b9c789d5e3bd2960bfbdad62b9b7b575e3aea59a8824c6116024a3d5b7fa3702634d45c04f41c0fcd83bebeb125dd218bd2f197c8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leaflet-doc"

RDEPENDS:${PN} += ""

inherit rpm
