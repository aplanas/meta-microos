SUMMARY = "Documentation for texlive-impnattypo"
DESCRIPTION = "This package includes the documentation for texlive-impnattypo"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn50227"

RPM_NAME = "texlive-impnattypo-doc-2023.201.1.5svn50227-52.1.noarch.rpm"
RPM_HASH = "fadb3e9ff586f25f674b48d3b4bf8b008ec91da52fbcdde36b1a76574ab4d834d698a583bdf1ff6e342b728a6eea5c16ffb5f4486da94bb6cba8f4fe2643d549"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-impnattypo-doc-fr;en \
texlive-impnattypo-doc"

RDEPENDS:${PN} += ""

inherit rpm
