SUMMARY = "Documentation for texlive-engtlc"
DESCRIPTION = "This package includes the documentation for texlive-engtlc"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2svn28571"

RPM_NAME = "texlive-engtlc-doc-2023.201.3.2svn28571-53.1.noarch.rpm"
RPM_HASH = "670cb63cd4d278a5448aa8a92bab7c808407eb3a908fbbd56e57f28d38cab7fb31f642e3bf0218e7102981d347e32d265db457db4510ee03ebf3f24e35839829"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-engtlc-doc:en;it) \
texlive-engtlc-doc"
RDEPENDS:${PN} += ""

inherit rpm
