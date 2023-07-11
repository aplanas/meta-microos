SUMMARY = "Documentation for texlive-glossaries-slovene"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-slovene"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51211"

RPM_NAME = "texlive-glossaries-slovene-doc-2023.201.1.0svn51211-53.2.noarch.rpm"
RPM_HASH = "1847f748a9a8ef26c87a86f8d28a0c139bbfa2cab2e462f43dcc838c0b6a78b862c763a02558a7c81a711343f8fbc4e85b8858d7d1c542d9609993e6624e3374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-slovene-doc"

RDEPENDS:${PN} += ""

inherit rpm
