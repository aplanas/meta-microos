SUMMARY = "Documentation for texlive-roboto"
DESCRIPTION = "This package includes the documentation for texlive-roboto"
LICENSE = "Apache-1.0"

PV = "2023.209.svn64350"

RPM_NAME = "texlive-roboto-doc-2023.209.svn64350-54.2.noarch.rpm"
RPM_HASH = "8c5a3cc9e093303e2355f41402a079671113c05a9e2ef06df18d921f07b2b75f5e5eca97d046244b8481706fa0792f4823a449acfaee6ff73855f0d342d0845e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roboto-doc"

RDEPENDS:${PN} += ""

inherit rpm
