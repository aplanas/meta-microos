SUMMARY = "Documentation for texlive-unitconv"
DESCRIPTION = "This package includes the documentation for texlive-unitconv"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn55060"

RPM_NAME = "texlive-unitconv-doc-2023.209.0.0.01svn55060-54.1.noarch.rpm"
RPM_HASH = "d732d3cfc2979da3cb7233fdcae9f1a207c6639630f995124a84049c507c8eb0f255b8844c3e34b358161b61f2d34d293f839e01e99dca468921207d6034ec36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unitconv-doc"

RDEPENDS:${PN} += ""

inherit rpm
