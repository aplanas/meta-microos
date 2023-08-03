SUMMARY = "Documentation for texlive-bengali"
DESCRIPTION = "This package includes the documentation for texlive-bengali"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55475"

RPM_NAME = "texlive-bengali-doc-2023.209.svn55475-54.1.noarch.rpm"
RPM_HASH = "5a18e6ed807e23b72e62d7d3c19e47085251a33405c3b62e4f2876fd67ce69a3f3f25a77c33a9f19f9543ac534ec5e584390729c7e2321cd9a6db72445369b7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bengali-doc"

RDEPENDS:${PN} += ""

inherit rpm
