SUMMARY = "Documentation for texlive-tikzposter"
DESCRIPTION = "This package includes the documentation for texlive-tikzposter"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn32732"

RPM_NAME = "texlive-tikzposter-doc-2023.201.2.0svn32732-52.1.noarch.rpm"
RPM_HASH = "042323ab69708071cb38745c9a49c20316f25d01fb73864f59dbe469612fd79262522297b1f8884f2cd8ea5fdd3e29a25d6a8a07ee9ddb602243ba725ce93352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
