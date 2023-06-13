SUMMARY = "Documentation for texlive-pas-cv"
DESCRIPTION = "This package includes the documentation for texlive-pas-cv"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.01svn32263"

RPM_NAME = "texlive-pas-cv-doc-2023.201.2.01svn32263-51.1.noarch.rpm"
RPM_HASH = "2dda27a4e24dda9d59c3a9666cf9f6a97d364a153e29c298b4bc075223f43d4ff9bf85e0655490dd180a0f4c6f78164556febd4e82c3e88894b1c5c3727a288c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pas-cv-doc:fr) \
texlive-pas-cv-doc"

RDEPENDS:${PN} += ""

inherit rpm
