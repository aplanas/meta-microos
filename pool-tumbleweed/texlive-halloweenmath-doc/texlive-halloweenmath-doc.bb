SUMMARY = "Documentation for texlive-halloweenmath"
DESCRIPTION = "This package includes the documentation for texlive-halloweenmath"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn52602"

RPM_NAME = "texlive-halloweenmath-doc-2023.209.0.0.11svn52602-54.1.noarch.rpm"
RPM_HASH = "e0a2bb14038d7139ad0b0ad1d4448dd5cccecd90ea64019b7824601ef3f50c8fd3b977e49be4376d90206a35a5a7a8d827cb7ad98a15754f036cd88b47c99ddf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-halloweenmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
