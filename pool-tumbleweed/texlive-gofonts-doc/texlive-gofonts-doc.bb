SUMMARY = "Documentation for texlive-gofonts"
DESCRIPTION = "This package includes the documentation for texlive-gofonts"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64358"

RPM_NAME = "texlive-gofonts-doc-2023.209.svn64358-54.1.noarch.rpm"
RPM_HASH = "cafa1b8a4fac3fd09b0786ae1e412ca8756e4bea0c3ff71fd2bf3f7066a9a9f95f18412ad4da67b5706eae960026b3ad359581c3da9833e40dfc74b8d8af0c71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gofonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
