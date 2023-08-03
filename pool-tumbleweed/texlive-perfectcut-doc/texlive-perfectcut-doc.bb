SUMMARY = "Documentation for texlive-perfectcut"
DESCRIPTION = "This package includes the documentation for texlive-perfectcut"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn54080"

RPM_NAME = "texlive-perfectcut-doc-2023.209.2.3svn54080-52.1.noarch.rpm"
RPM_HASH = "0db31ffed01bb5c72e7452e9ba172554f0e52755abb8c3052557d23d460ac59d67de302674f9933a273161a8a32559db8c41432137eb9956cda96f37c8478f51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-perfectcut-doc"

RDEPENDS:${PN} += ""

inherit rpm
