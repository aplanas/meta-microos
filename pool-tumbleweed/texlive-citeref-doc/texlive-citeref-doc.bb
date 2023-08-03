SUMMARY = "Documentation for texlive-citeref"
DESCRIPTION = "This package includes the documentation for texlive-citeref"
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.1svn47407"

RPM_NAME = "texlive-citeref-doc-2023.209.1.1svn47407-54.1.noarch.rpm"
RPM_HASH = "e3507f1fd01412919405aa9c7970b55cca11519b03f7fa6496ef4cd78681a24a6b9c55b4ffcba083985747625500164e1054d5d34c3c4c1663fed8f237588bfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-citeref-doc"

RDEPENDS:${PN} += ""

inherit rpm
