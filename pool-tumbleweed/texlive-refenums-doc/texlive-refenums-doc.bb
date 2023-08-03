SUMMARY = "Documentation for texlive-refenums"
DESCRIPTION = "This package includes the documentation for texlive-refenums"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2svn44131"

RPM_NAME = "texlive-refenums-doc-2023.209.1.1.2svn44131-54.1.noarch.rpm"
RPM_HASH = "ea686f6891a5fc01f93cc224de4866aa00a04c777f1c49009db452c421dacd4dc6ce58b6263b01d0917632ca8299a8253a84f7fc1d972dc97b9c005b98aee8fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refenums-doc"

RDEPENDS:${PN} += ""

inherit rpm
