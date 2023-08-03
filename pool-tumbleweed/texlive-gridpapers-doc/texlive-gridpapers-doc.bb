SUMMARY = "Documentation for texlive-gridpapers"
DESCRIPTION = "This package includes the documentation for texlive-gridpapers"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn58723"

RPM_NAME = "texlive-gridpapers-doc-2023.209.1.0.2svn58723-54.1.noarch.rpm"
RPM_HASH = "62e9b90a9c4428ceb1fdc9fa57842b9c96c53dfd4ba98e6dd232505e5e83bd2e25b1c351e4e96b2919b5a76e8f324caea4aca3abc8226c7cfb2f2dd7f78ddfb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gridpapers-doc"

RDEPENDS:${PN} += ""

inherit rpm
