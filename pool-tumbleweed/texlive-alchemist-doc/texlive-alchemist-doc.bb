SUMMARY = "Documentation for texlive-alchemist"
DESCRIPTION = "This package includes the documentation for texlive-alchemist"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.00svn66548"

RPM_NAME = "texlive-alchemist-doc-2023.201.1.00svn66548-54.1.noarch.rpm"
RPM_HASH = "dda3f1945c21434c777bcbd3cf0f795c2c59742fea192f28eb9031b68e5a007a8bd1c11fd92cbf18995d3f983abb83d825dfaeef22b644d199b69e6fb727a1ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alchemist-doc"
RDEPENDS:${PN} += ""

inherit rpm
