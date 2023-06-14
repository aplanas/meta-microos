SUMMARY = "Documentation for texlive-pdfjam"
DESCRIPTION = "This package includes the documentation for texlive-pdfjam"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.03svn56991"

RPM_NAME = "texlive-pdfjam-doc-2023.201.3.03svn56991-51.1.noarch.rpm"
RPM_HASH = "89e4fd63b6261f39ea60b09b145a9d97240afd293ef50ecffd333266b36d5a1c3a126fd5d4cace17cb3515e11535be3b236a36ec0b47fd9f072bb6ae4a1944d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdfjam.1 \
texlive-pdfjam-doc"

RDEPENDS:${PN} += ""

inherit rpm
