SUMMARY = "Documentation for texlive-glossaries-nynorsk"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-nynorsk"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55189"

RPM_NAME = "texlive-glossaries-nynorsk-doc-2023.209.1.0svn55189-54.2.noarch.rpm"
RPM_HASH = "88cc5a922b83a8c1f756206323c70997ba44bf487400717e95d2f555b3e7a19c1b7ecdc6e46f1cb5214b2134276a07698bae4394e2940bcda56a79076b788d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-nynorsk-doc"

RDEPENDS:${PN} += ""

inherit rpm
