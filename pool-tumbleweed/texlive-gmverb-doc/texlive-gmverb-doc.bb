SUMMARY = "Documentation for texlive-gmverb"
DESCRIPTION = "This package includes the documentation for texlive-gmverb"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.98svn24288"

RPM_NAME = "texlive-gmverb-doc-2023.209.0.0.98svn24288-54.2.noarch.rpm"
RPM_HASH = "0019e70fbc7bc76389c28a5a75d9f365ba5f4daaf1e6f2754de9fc202d53fa1722e5f10a7f211a17620ea7a9a7aea2f5a24eafde84449c5998932a91af29f132"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmverb-doc"

RDEPENDS:${PN} += ""

inherit rpm
