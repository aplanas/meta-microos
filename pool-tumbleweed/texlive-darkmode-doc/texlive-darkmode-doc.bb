SUMMARY = "Documentation for texlive-darkmode"
DESCRIPTION = "This package includes the documentation for texlive-darkmode"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0.1svn64271"

RPM_NAME = "texlive-darkmode-doc-2023.204.1.0.1svn64271-54.1.noarch.rpm"
RPM_HASH = "994401f7a6b94de94f757464703d97b0d59328de62a086f93ee4fcf44a718b4eab06648791c03672a65a1c4bac65cf7a2e97e62fc574de8c40b2ba7d8de09cdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-darkmode-doc"
RDEPENDS:${PN} += ""

inherit rpm
