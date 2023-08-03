SUMMARY = "Documentation for texlive-kluwer"
DESCRIPTION = "This package includes the documentation for texlive-kluwer"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-kluwer-doc-2023.209.svn54074-56.1.noarch.rpm"
RPM_HASH = "45fec402376aeef1161498d46f7d7e1c62c62599f4cc60a697255738479bc67cc3c4289646a83bdf5720856d7f577a9236f25349d7e81affaffc759d6334751a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kluwer-doc"

RDEPENDS:${PN} += ""

inherit rpm
