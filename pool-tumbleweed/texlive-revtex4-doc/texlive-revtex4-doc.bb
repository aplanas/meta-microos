SUMMARY = "Documentation for texlive-revtex4"
DESCRIPTION = "This package includes the documentation for texlive-revtex4"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0asvn56589"

RPM_NAME = "texlive-revtex4-doc-2023.209.4.0asvn56589-54.1.noarch.rpm"
RPM_HASH = "f7302455b0fbd1c5922a5fe2e0bfad8096e752c7c0d2241bed584cafc1ff8884a7f7f8d4119b7091c87a2e366e5992aa97dcd23f8172fcb34888639e543a34b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revtex4-doc"

RDEPENDS:${PN} += ""

inherit rpm
