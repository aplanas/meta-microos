SUMMARY = "Documentation for texlive-digiconfigs"
DESCRIPTION = "This package includes the documentation for texlive-digiconfigs"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn15878"

RPM_NAME = "texlive-digiconfigs-doc-2023.209.0.0.5svn15878-53.1.noarch.rpm"
RPM_HASH = "64f212e31209d7a7907264665481a872a58ca8d4a20032eecc18a7d3709bd9f17914716e53679eb6f8b7efbd2101bab0fa6774ae809db492e944b79ee71f9b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-digiconfigs-doc"

RDEPENDS:${PN} += ""

inherit rpm
