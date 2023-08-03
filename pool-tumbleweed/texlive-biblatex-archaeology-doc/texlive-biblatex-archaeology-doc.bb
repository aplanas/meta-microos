SUMMARY = "Documentation for texlive-biblatex-archaeology"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-archaeology"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn53281"

RPM_NAME = "texlive-biblatex-archaeology-doc-2023.209.2.2svn53281-54.1.noarch.rpm"
RPM_HASH = "2b37617479fc04c6b364811363d5638f8f87e814bfd8297219b6859ea0ce646f58e28dd701993e840e8a302893374d03e462d2579c59f0dbab0d1ac1644e8fc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-archaeology-doc"

RDEPENDS:${PN} += ""

inherit rpm
