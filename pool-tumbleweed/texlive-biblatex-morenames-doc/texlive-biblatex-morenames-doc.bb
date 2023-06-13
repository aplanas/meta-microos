SUMMARY = "Documentation for texlive-biblatex-morenames"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-morenames"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.1svn43049"

RPM_NAME = "texlive-biblatex-morenames-doc-2023.201.1.3.1svn43049-53.1.noarch.rpm"
RPM_HASH = "411c4c777f0caa0ba0f780fcf5c94dc29c2c2557b4c1b28e5a7ba18201bc4774573c496bd6927d61063238411a3ead5a79c9486a04558bd452883eb1a73d14f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-morenames-doc"

RDEPENDS:${PN} += "/usr/bin/python"

inherit rpm
