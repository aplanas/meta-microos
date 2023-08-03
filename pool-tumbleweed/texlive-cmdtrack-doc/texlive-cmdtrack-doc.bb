SUMMARY = "Documentation for texlive-cmdtrack"
DESCRIPTION = "This package includes the documentation for texlive-cmdtrack"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn28910"

RPM_NAME = "texlive-cmdtrack-doc-2023.209.svn28910-54.1.noarch.rpm"
RPM_HASH = "41f1b284c37e7f2e7a8b0069262ece689033131ada52fb75d5b9644dae51a44d7ff4ed977af8caa86c9f5f11c10da1160b422de1921240ff1c4f664972e32cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmdtrack-doc"

RDEPENDS:${PN} += ""

inherit rpm
