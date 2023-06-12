SUMMARY = "Documentation for texlive-antt"
DESCRIPTION = "This package includes the documentation for texlive-antt"
LICENSE = "LPPL-1.3c"

PV = "2023.201.2.08svn18651"

RPM_NAME = "texlive-antt-doc-2023.201.2.08svn18651-54.1.noarch.rpm"
RPM_HASH = "76fbd268b267c7a122c36f1ddad85f97de8debe339bfd673e9015eea94b944f2eca1ccb7d13480d0ad27bc7ee00566c5dcda4f0abedb81c5a5e7d6bbba9d7d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-antt-doc:en;pl) \
texlive-antt-doc"
RDEPENDS:${PN} += ""

inherit rpm
