SUMMARY = "Documentation for texlive-accessibility"
DESCRIPTION = "This package includes the documentation for texlive-accessibility"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.3svn55777"

RPM_NAME = "texlive-accessibility-doc-2023.209.2.0.3svn55777-55.1.noarch.rpm"
RPM_HASH = "e8ed7cd0020ace3f58f86fd71f9140faee4af317723d0d05fc502cf3076d218338d38cf42bd9e94ebef89912d4efb0fc68654f4cd538f539de0084d629c8983a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-accessibility-doc-de;en \
texlive-accessibility-doc"

RDEPENDS:${PN} += ""

inherit rpm
