SUMMARY = "Documentation for texlive-hep"
DESCRIPTION = "This package includes the documentation for texlive-hep"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-hep-doc-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "55471356f3007cdef9cf0a70c3bdb193874cd189d47aab7da11929e77d916dd679d8b123f0ecba7a796729d672c8201650b9a306ff5f1e40d59b69c54b0aa055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-doc"

RDEPENDS:${PN} += ""

inherit rpm
