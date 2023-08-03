SUMMARY = "Documentation for texlive-songproj"
DESCRIPTION = "This package includes the documentation for texlive-songproj"
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.0.1svn64966"

RPM_NAME = "texlive-songproj-doc-2023.209.1.0.1svn64966-58.1.noarch.rpm"
RPM_HASH = "68f1ae228c4533377853caefca8171bb276b4e77336bdbee0b74284f070d02697d75688e4afe201e40ee5d0593410e2baa0a9cb0e5cf7b607de5dd50d5c8fc3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-songproj-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
