SUMMARY = "Documentation for texlive-nicematrix"
DESCRIPTION = "This package includes the documentation for texlive-nicematrix"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.16svn66461"

RPM_NAME = "texlive-nicematrix-doc-2023.201.6.16svn66461-54.1.noarch.rpm"
RPM_HASH = "5e1dbab1e430d4255947cffdd48d4e18959068e6ed6ca2462ba42c0eee437cdaef821f93a1cb853ac2a37796eb128ba91116120fc13f268d2417e2d5a5a225fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-nicematrix-doc:fr) \
texlive-nicematrix-doc"
RDEPENDS:${PN} += ""

inherit rpm
