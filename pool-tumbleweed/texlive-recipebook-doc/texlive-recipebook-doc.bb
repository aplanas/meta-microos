SUMMARY = "Documentation for texlive-recipebook"
DESCRIPTION = "This package includes the documentation for texlive-recipebook"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn37026"

RPM_NAME = "texlive-recipebook-doc-2023.201.svn37026-53.2.noarch.rpm"
RPM_HASH = "850da04c54b42a515c814a90d41d0bae20f1acf7e77d31721710ae2a61524e8c4e364992d6e1cc4ec5eb82129309e9ca121c713b786ddbb46e35bf14d900a03a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recipebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
