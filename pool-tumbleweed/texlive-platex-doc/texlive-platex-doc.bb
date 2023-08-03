SUMMARY = "Documentation for texlive-platex"
DESCRIPTION = "This package includes the documentation for texlive-platex"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-platex-doc-2023.209.svn66186-53.1.noarch.rpm"
RPM_HASH = "647fe5db3ca3b914f667412932aab302f16e49f5706961d6f6dec4694bf7c3c73fde4f48c06e907655da0381f08c8a309f50e43af44a8035a5bd8c130474fbb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-platex-doc-ja \
man-platex.1 \
texlive-platex-doc"

RDEPENDS:${PN} += ""

inherit rpm
