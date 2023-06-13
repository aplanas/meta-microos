SUMMARY = "Documentation for texlive-soulpos"
DESCRIPTION = "This package includes the documentation for texlive-soulpos"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn60772"

RPM_NAME = "texlive-soulpos-doc-2023.201.1.2svn60772-57.1.noarch.rpm"
RPM_HASH = "b98a33a354242de90bc0222f84d43abb27225e770deae23f37a669854bd2a5dad46e000bae19e05d72c19bd03806b7166cf3572598878107eae8f8d8e65f23ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-soulpos-doc"

RDEPENDS:${PN} += ""

inherit rpm
