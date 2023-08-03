SUMMARY = "Documentation for texlive-greekdates"
DESCRIPTION = "This package includes the documentation for texlive-greekdates"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-greekdates-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "ed4acf82ae2968fa20753d2424d67352e30905f71a72fed93027f92aaeea0e30f5956972c8470aa28d8a592e6057574939717f64662e983595ffb071c42d1bcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greekdates-doc"

RDEPENDS:${PN} += ""

inherit rpm
