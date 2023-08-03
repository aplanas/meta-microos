SUMMARY = "Documentation for texlive-pst-fill"
DESCRIPTION = "This package includes the documentation for texlive-pst-fill"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn60671"

RPM_NAME = "texlive-pst-fill-doc-2023.209.1.02svn60671-53.1.noarch.rpm"
RPM_HASH = "65e7bbf784898d6db1345bd0ace5406bda689e3fbd18ee3568793d1905c94e167a9e6de7c9ea625e9c8cd114955ac45cdb6993e1f0fc839cea8852c765fee7e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-fill-doc"

RDEPENDS:${PN} += ""

inherit rpm
