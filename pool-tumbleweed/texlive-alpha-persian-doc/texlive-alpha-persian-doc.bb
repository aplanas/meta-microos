SUMMARY = "Documentation for texlive-alpha-persian"
DESCRIPTION = "This package includes the documentation for texlive-alpha-persian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn66115"

RPM_NAME = "texlive-alpha-persian-doc-2023.201.1.3svn66115-54.1.noarch.rpm"
RPM_HASH = "40fc9f602b07ce20160cfd3f1600bb61586774f08f7c28526374ad2fc53ebb9f0d823e0e2cb11e0c461b1a03b7d2057298e1b499427ae8800ff16475fd67d616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-alpha-persian-doc:fa) \
texlive-alpha-persian-doc"
RDEPENDS:${PN} += ""

inherit rpm
