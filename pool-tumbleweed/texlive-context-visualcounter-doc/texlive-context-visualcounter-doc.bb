SUMMARY = "Documentation for texlive-context-visualcounter"
DESCRIPTION = "This package includes the documentation for texlive-context-visualcounter"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-visualcounter-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "d0237a82616fc1632b2ac4b64ff53f458734e3786e9c8dacf8d2dc47c8e667ddc026ded62a747c6e4988fff24d65f43f13f36cbb20ee9e08e28de71f76bcb6bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-visualcounter-doc"

RDEPENDS:${PN} += ""

inherit rpm
