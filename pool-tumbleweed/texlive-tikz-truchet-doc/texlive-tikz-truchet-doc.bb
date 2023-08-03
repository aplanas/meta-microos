SUMMARY = "Documentation for texlive-tikz-truchet"
DESCRIPTION = "This package includes the documentation for texlive-tikz-truchet"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn50020"

RPM_NAME = "texlive-tikz-truchet-doc-2023.209.svn50020-53.1.noarch.rpm"
RPM_HASH = "eaf7c0b2ed3fe5be4e42229d314b7a523d69271ba39ad87c896cd2090826db7535b38063806df63a2337c7cffe2ad820fbac5c4cb09d152d68fb864ddc790e8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-truchet-doc"

RDEPENDS:${PN} += ""

inherit rpm
