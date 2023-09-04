SUMMARY = "Documentation for texlive-pst-tools"
DESCRIPTION = "This package includes the documentation for texlive-pst-tools"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.12svn60621"

RPM_NAME = "texlive-pst-tools-doc-2023.209.0.0.12svn60621-54.2.noarch.rpm"
RPM_HASH = "48ab8f13f670e09ad172cc0a778f4e7f5c79b551dc2aa42b2e562b52c169b5bd626f375d60a3121114cdd9bc3c51c442cb1e2ce344e90c78ab0f97e93afd789f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
