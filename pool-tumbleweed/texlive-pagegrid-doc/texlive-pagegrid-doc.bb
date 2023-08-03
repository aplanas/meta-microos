SUMMARY = "Documentation for texlive-pagegrid"
DESCRIPTION = "This package includes the documentation for texlive-pagegrid"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn64470"

RPM_NAME = "texlive-pagegrid-doc-2023.209.1.6svn64470-52.1.noarch.rpm"
RPM_HASH = "041689ce4b9ac66e3250aab9b05f737ea4f87a7a6bee498fd6611e5e1413d19d527e6062a8c1f440fb3c5c0b27ded0b2df17e6f20c872661473112398a2ceab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pagegrid-doc-en \
texlive-pagegrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
