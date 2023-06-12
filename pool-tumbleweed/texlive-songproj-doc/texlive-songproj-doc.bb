SUMMARY = "Documentation for texlive-songproj"
DESCRIPTION = "This package includes the documentation for texlive-songproj"
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.0.1svn64966"

RPM_NAME = "texlive-songproj-doc-2023.201.1.0.1svn64966-57.1.noarch.rpm"
RPM_HASH = "bc2617b8151e906b75787ddc8de47ee341144408db4c661b5d383b69c2214a8f1488d86b6d86c3384a63af26bf68ec96670f4af2ba9a7a05e9f19dad856c8124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-songproj-doc"
RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
