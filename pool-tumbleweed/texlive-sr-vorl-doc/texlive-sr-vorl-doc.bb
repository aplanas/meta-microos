SUMMARY = "Documentation for texlive-sr-vorl"
DESCRIPTION = "This package includes the documentation for texlive-sr-vorl"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn59333"

RPM_NAME = "texlive-sr-vorl-doc-2023.209.1.2svn59333-58.1.noarch.rpm"
RPM_HASH = "36432b657478b057c9562d17bc3e218635c3d926c1ad55a8a36fbd243278957b6a713a51985a1f342e7c54aa0ece8c71bbea0263e4446caac1703d18a32278c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sr-vorl-doc"

RDEPENDS:${PN} += ""

inherit rpm
