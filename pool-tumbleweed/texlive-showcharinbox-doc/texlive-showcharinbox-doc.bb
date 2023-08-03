SUMMARY = "Documentation for texlive-showcharinbox"
DESCRIPTION = "This package includes the documentation for texlive-showcharinbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn29803"

RPM_NAME = "texlive-showcharinbox-doc-2023.209.0.0.1svn29803-54.1.noarch.rpm"
RPM_HASH = "e127d75db364fc367ee8df277b92f0ccd3f6594a4ae6147c68a6ad629f51b8f38114eee768c08837ec6802055f1b6efb43f9cf58875812b7751aafb6215ed1a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showcharinbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
