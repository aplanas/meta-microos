SUMMARY = "Documentation for texlive-systeme"
DESCRIPTION = "This package includes the documentation for texlive-systeme"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.34svn55015"

RPM_NAME = "texlive-systeme-doc-2023.209.0.0.34svn55015-58.1.noarch.rpm"
RPM_HASH = "77ea9dfc2491e82f87b91908e7f995c2ae16184b823b3f911fab8500577b7eea5f6772a03e38d1fe07eceaf072dca7cb7df787777c3607d8671f6b88acebd2a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-systeme-doc-fr \
texlive-systeme-doc"

RDEPENDS:${PN} += ""

inherit rpm
