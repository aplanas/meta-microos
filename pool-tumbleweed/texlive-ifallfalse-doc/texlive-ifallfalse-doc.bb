SUMMARY = "Documentation for texlive-ifallfalse"
DESCRIPTION = "This package includes the documentation for texlive-ifallfalse"
LICENSE = "LPPL-1.0"

PV = "2023.208.2.0.0svn60027"

RPM_NAME = "texlive-ifallfalse-doc-2023.208.2.0.0svn60027-53.1.noarch.rpm"
RPM_HASH = "1c2289e5b3704897ab39f23655e5c880f848e4af075b93ec166f288194997f9d51ebcd04288bfb0f90a758036c4548686b3ed9eafb39f805a4530a1c37ce0e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifallfalse-doc"

RDEPENDS:${PN} += ""

inherit rpm
