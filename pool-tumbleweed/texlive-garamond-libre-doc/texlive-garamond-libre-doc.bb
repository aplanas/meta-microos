SUMMARY = "Documentation for texlive-garamond-libre"
DESCRIPTION = "This package includes the documentation for texlive-garamond-libre"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn64412"

RPM_NAME = "texlive-garamond-libre-doc-2023.209.1.4svn64412-53.1.noarch.rpm"
RPM_HASH = "8f16bfb91cd3dc03a261db139660edaf4cd80a0853ac4fff7bca47e54bcc83a6a7a52c070125f94a32b541545b9081716fb0b2a4596911b3e5734323f258a0dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-garamond-libre-doc"

RDEPENDS:${PN} += ""

inherit rpm
