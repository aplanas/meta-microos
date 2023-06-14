SUMMARY = "Documentation for texlive-codicefiscaleitaliano"
DESCRIPTION = "This package includes the documentation for texlive-codicefiscaleitaliano"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn29803"

RPM_NAME = "texlive-codicefiscaleitaliano-doc-2023.201.1.2svn29803-53.1.noarch.rpm"
RPM_HASH = "d68cf48a05d171095ffc96e576325771f02d4c02d765a641787fb7f40c0158e5164c030e8eb7648a9aca0342ee58c67ca33256de7c1c652ebf1522759c142334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-codicefiscaleitaliano-doc-it \
texlive-codicefiscaleitaliano-doc"

RDEPENDS:${PN} += ""

inherit rpm
