SUMMARY = "Documentation for texlive-metastr"
DESCRIPTION = "This package includes the documentation for texlive-metastr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2svn56246"

RPM_NAME = "texlive-metastr-doc-2023.209.1.1.2svn56246-55.1.noarch.rpm"
RPM_HASH = "225168933c559de0c1d6a6418ae37c60105f668aa0cc720fbb15a73ef7a448d6634f7556b8ce772aa936003ba56009eb789289d1d15424ffc7d2e456d1aecd43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metastr-doc"

RDEPENDS:${PN} += ""

inherit rpm
