SUMMARY = "Documentation for texlive-clrstrip"
DESCRIPTION = "This package includes the documentation for texlive-clrstrip"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn60363"

RPM_NAME = "texlive-clrstrip-doc-2023.209.svn60363-54.1.noarch.rpm"
RPM_HASH = "4c3c155ae53cdc5d397d16613bbec4fb4b3ed9c69c6762bd5fd2939516484ff8cb2043bbd40ee981b834fa52fdf774acabfdf9be1c01ce6c3079fafe9c0edf61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clrstrip-doc"

RDEPENDS:${PN} += ""

inherit rpm
