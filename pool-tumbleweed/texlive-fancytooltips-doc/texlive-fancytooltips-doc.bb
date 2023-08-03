SUMMARY = "Documentation for texlive-fancytooltips"
DESCRIPTION = "This package includes the documentation for texlive-fancytooltips"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn56291"

RPM_NAME = "texlive-fancytooltips-doc-2023.209.1.8svn56291-53.1.noarch.rpm"
RPM_HASH = "5e30de545a1c6d8bdf3f686a40c44580801582bcd67f74fa2e7152d600e023098e0de4257cc60ca623812677b4e99f0729692c64d8a6558d7939cfb0163b763c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancytooltips-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
