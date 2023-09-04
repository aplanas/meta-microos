SUMMARY = "Documentation for texlive-qcircuit"
DESCRIPTION = "This package includes the documentation for texlive-qcircuit"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.6.0svn48400"

RPM_NAME = "texlive-qcircuit-doc-2023.209.2.6.0svn48400-54.2.noarch.rpm"
RPM_HASH = "a151a87192648831b59416ebbb7be62073542a36b96db7ca20540d571e92b592f0a2bf7fa024b8c18474eb7c3960b12f44b3df327b855444518a9efcae9f1d60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qcircuit-doc"

RDEPENDS:${PN} += ""

inherit rpm
