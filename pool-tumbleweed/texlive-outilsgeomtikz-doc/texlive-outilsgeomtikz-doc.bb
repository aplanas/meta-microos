SUMMARY = "Documentation for texlive-outilsgeomtikz"
DESCRIPTION = "This package includes the documentation for texlive-outilsgeomtikz"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn66461"

RPM_NAME = "texlive-outilsgeomtikz-doc-2023.201.0.0.1.1svn66461-54.1.noarch.rpm"
RPM_HASH = "b5ecdb5cd98fe6f90dd51f2cf5984817848c16cfb8f34aec7d7dd651fe9c7fa5ab534aafcbf1d43dc02203adbceb1f994bb721040728a85a8d5c0c9a288880a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-outilsgeomtikz-doc-fr \
texlive-outilsgeomtikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
