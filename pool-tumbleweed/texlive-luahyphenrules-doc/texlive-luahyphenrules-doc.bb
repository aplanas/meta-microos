SUMMARY = "Documentation for texlive-luahyphenrules"
DESCRIPTION = "This package includes the documentation for texlive-luahyphenrules"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn56200"

RPM_NAME = "texlive-luahyphenrules-doc-2023.208.1.1svn56200-53.1.noarch.rpm"
RPM_HASH = "cafb21cd63205d52fa685904993a35345435e045638b5895b35b9980e85c9284fc4cb142f87e5e18a197e4b63b1156d8e89f1ca7344df0d47235524f4a965594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luahyphenrules-doc"

RDEPENDS:${PN} += ""

inherit rpm
