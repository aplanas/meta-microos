SUMMARY = "Documentation for texlive-nl-interval"
DESCRIPTION = "This package includes the documentation for texlive-nl-interval"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn58328"

RPM_NAME = "texlive-nl-interval-doc-2023.209.1.0svn58328-55.1.noarch.rpm"
RPM_HASH = "03cf72a3acad38fc62f1bd173e3f5a11a723377c9b1f0b690779d3f1c01c0f07657f8a09176d7518f13778f8a2095027056da4f1f0ebd57d92058dc44af7d1c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nl-interval-doc"

RDEPENDS:${PN} += ""

inherit rpm
