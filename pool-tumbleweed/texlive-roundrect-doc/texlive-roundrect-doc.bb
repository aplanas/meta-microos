SUMMARY = "Documentation for texlive-roundrect"
DESCRIPTION = "This package includes the documentation for texlive-roundrect"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn39796"

RPM_NAME = "texlive-roundrect-doc-2023.201.2.2svn39796-53.1.noarch.rpm"
RPM_HASH = "358a637d4b99c24dbc861c2512f4df4757a8b2f57209ff6496a1f5b887d1e315d0ffe09b73e6520699ac78fcfc8e1a257d8f29bc8d5afd37a650d36632b710c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roundrect-doc"

RDEPENDS:${PN} += ""

inherit rpm
