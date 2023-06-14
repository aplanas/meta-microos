SUMMARY = "Documentation for texlive-nonfloat"
DESCRIPTION = "This package includes the documentation for texlive-nonfloat"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn17598"

RPM_NAME = "texlive-nonfloat-doc-2023.201.1.0svn17598-54.1.noarch.rpm"
RPM_HASH = "ddaca5cdad092b1dc5a31b36552ffe09b79646e84ed5bb8a570472fd647a744e0a6778a326c54cc5dcedba885f981d053b22f5df1d37381c032cf25cf694ba20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nonfloat-doc-en;de \
texlive-nonfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
