SUMMARY = "Documentation for texlive-pst-vowel"
DESCRIPTION = "This package includes the documentation for texlive-pst-vowel"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn25228"

RPM_NAME = "texlive-pst-vowel-doc-2023.209.1.0svn25228-54.2.noarch.rpm"
RPM_HASH = "85e803d6abb879ac03684dfb43dce2bf7f4381fbc6315f8daaea66352a909d0f1a85b8a2e8dcce8cdd9a561528cff51e825c9f538a7f7b97e2af17f262a50158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-vowel-doc"

RDEPENDS:${PN} += ""

inherit rpm
