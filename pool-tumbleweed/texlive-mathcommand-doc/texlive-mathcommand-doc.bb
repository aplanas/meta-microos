SUMMARY = "Documentation for texlive-mathcommand"
DESCRIPTION = "This package includes the documentation for texlive-mathcommand"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.04svn59512"

RPM_NAME = "texlive-mathcommand-doc-2023.208.1.04svn59512-53.1.noarch.rpm"
RPM_HASH = "23836911ac95d3da3ef1cfb2ce747a1ac698815c880a76b170ac9c42d193a3118370d00624ac6e679dccf855fe77c8746fbbf5343f52ddd47e6e7d639f27df96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathcommand-doc"

RDEPENDS:${PN} += ""

inherit rpm
