SUMMARY = "Documentation for texlive-ibycus-babel"
DESCRIPTION = "This package includes the documentation for texlive-ibycus-babel"
LICENSE = "LPPL-1.0"

PV = "2023.208.3.0svn15878"

RPM_NAME = "texlive-ibycus-babel-doc-2023.208.3.0svn15878-53.1.noarch.rpm"
RPM_HASH = "49a965efae48138800539aa23aed13cf672f2df679ef559d1549bda37a78ac049f87da8da87f07042a28c9d690268110203a522fbc51543d353bfe070a81979c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ibycus-babel-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
