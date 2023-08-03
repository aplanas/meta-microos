SUMMARY = "Documentation for texlive-gfsneohellenic"
DESCRIPTION = "This package includes the documentation for texlive-gfsneohellenic"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn63944"

RPM_NAME = "texlive-gfsneohellenic-doc-2023.209.1.02svn63944-53.1.noarch.rpm"
RPM_HASH = "a8b8785e1532eeeafddcee7f65914689595eaeeb76f729f8ae4dff30753b62d0007c8f61a25799e8f134f0a3ac9e4f599315660297cf0a005e874396b48245f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsneohellenic-doc"

RDEPENDS:${PN} += ""

inherit rpm
