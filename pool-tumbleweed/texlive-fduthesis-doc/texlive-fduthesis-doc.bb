SUMMARY = "Documentation for texlive-fduthesis"
DESCRIPTION = "This package includes the documentation for texlive-fduthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9svn66188"

RPM_NAME = "texlive-fduthesis-doc-2023.209.0.0.9svn66188-53.1.noarch.rpm"
RPM_HASH = "abaac14ee0a28fd02587c9026ac6f06015748a874920f93f420dec33a9ce70b195b8c8055c5e49a96860ee83b520ed2ae1f25c85dd59af32f5c4fdc981ce0df3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fduthesis-doc-zh;en \
texlive-fduthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
