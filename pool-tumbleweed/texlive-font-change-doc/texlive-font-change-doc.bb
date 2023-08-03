SUMMARY = "Documentation for texlive-font-change"
DESCRIPTION = "This package includes the documentation for texlive-font-change"
LICENSE = "LPPL-1.0"

PV = "2023.209.2015.2svn40403"

RPM_NAME = "texlive-font-change-doc-2023.209.2015.2svn40403-53.1.noarch.rpm"
RPM_HASH = "7619efb8498d6251b40810ce3960c7403ad9cf2c77a8b7ffff81bab77f4dfb0fbc8cf0c5689b8c598b8ee987ac7e1be36c8a27d17d7b25ca8378141135102ca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-font-change-doc"

RDEPENDS:${PN} += ""

inherit rpm
