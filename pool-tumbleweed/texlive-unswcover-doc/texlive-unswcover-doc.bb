SUMMARY = "Documentation for texlive-unswcover"
DESCRIPTION = "This package includes the documentation for texlive-unswcover"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn66115"

RPM_NAME = "texlive-unswcover-doc-2023.201.1.0svn66115-53.1.noarch.rpm"
RPM_HASH = "4a575d7ecbae4db02a4584c4032025622367220d6e791d4934e074b6bc88634a90a68621538fa6f096fd1349984592d71f6f0c4faa7468077efb235345b70cb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unswcover-doc"

RDEPENDS:${PN} += ""

inherit rpm
