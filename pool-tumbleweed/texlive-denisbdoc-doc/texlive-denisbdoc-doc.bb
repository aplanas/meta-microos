SUMMARY = "Documentation for texlive-denisbdoc"
DESCRIPTION = "This package includes the documentation for texlive-denisbdoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.4svn66137"

RPM_NAME = "texlive-denisbdoc-doc-2023.201.0.0.9.4svn66137-52.1.noarch.rpm"
RPM_HASH = "0533c29b72f32586aa055d57df1232e5ee3aebef5a4b5e708385572dbbff5fd10be5666d69fa6bedb3b9d842f7e03e939a74eea2a6940bf4a78c8d1bcf834dc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-denisbdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
