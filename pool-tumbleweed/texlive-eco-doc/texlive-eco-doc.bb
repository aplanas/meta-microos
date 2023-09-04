SUMMARY = "Documentation for texlive-eco"
DESCRIPTION = "This package includes the documentation for texlive-eco"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn29349"

RPM_NAME = "texlive-eco-doc-2023.209.1.3svn29349-54.2.noarch.rpm"
RPM_HASH = "c032ccd2f173105227250bd4bcc4d5d779bd0863b2e7ddb95249ad9c47a9456247931ee5769319ab978d205ab8f577511694a8fb7da70b1b04cbc1cabd96bfcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eco-doc"

RDEPENDS:${PN} += ""

inherit rpm
