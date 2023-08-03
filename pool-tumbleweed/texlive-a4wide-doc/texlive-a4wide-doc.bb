SUMMARY = "Documentation for texlive-a4wide"
DESCRIPTION = "This package includes the documentation for texlive-a4wide"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20943"

RPM_NAME = "texlive-a4wide-doc-2023.209.svn20943-55.1.noarch.rpm"
RPM_HASH = "e370e67fc02f23d10e8bdc6042ad274d4cc19c222e07c14fb88f3fcd8026fcc6bd9f02f41f58506dba33b98bddd4dc790b8f09c7a8605fc98068f7da09f8cbc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-a4wide-doc"

RDEPENDS:${PN} += ""

inherit rpm
