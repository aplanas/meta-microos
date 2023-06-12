SUMMARY = "Documentation for texlive-texaccents"
DESCRIPTION = "This package includes the documentation for texlive-texaccents"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn64447"

RPM_NAME = "texlive-texaccents-doc-2023.201.1.0.1svn64447-54.1.noarch.rpm"
RPM_HASH = "d55f5c48c751fc704368cc2b65c778d407d18754ecf788ac80fb9019a08f3867ab527a30e5d8321b4c04d6f058222eba38c5e8b7bbae287e0a8f12bcfe43fa27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(texaccents.1) \
texlive-texaccents-doc"
RDEPENDS:${PN} += ""

inherit rpm
