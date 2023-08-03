SUMMARY = "Documentation for texlive-slideshow"
DESCRIPTION = "This package includes the documentation for texlive-slideshow"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-slideshow-doc-2023.209.1.0svn15878-58.1.noarch.rpm"
RPM_HASH = "8555d125782f4e2af82896f0b41e6982fc72cb2f6d82af82841f2cf535816a85f52994d4394611747d48f62da4884fb43f0391d383a866139363e9403337a035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-slideshow-doc"

RDEPENDS:${PN} += ""

inherit rpm
