SUMMARY = "Documentation for texlive-refstyle"
DESCRIPTION = "This package includes the documentation for texlive-refstyle"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn20318"

RPM_NAME = "texlive-refstyle-doc-2023.201.0.0.5svn20318-53.2.noarch.rpm"
RPM_HASH = "2f29ae61f3b0da190dea0d68655e086d067d8f68fdbb973347a9cd8659216abb9ee9ca5f83d66bfe15a87052701996997b12942598e4ac7501c4829edcc7ca09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refstyle-doc"

RDEPENDS:${PN} += ""

inherit rpm
