SUMMARY = "Documentation for texlive-alpha-persian"
DESCRIPTION = "This package includes the documentation for texlive-alpha-persian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn66115"

RPM_NAME = "texlive-alpha-persian-doc-2023.209.1.3svn66115-55.1.noarch.rpm"
RPM_HASH = "1497d7c462590c263e5e483fdc325d4a0687a3b024de62641a81eb33eb21d82504953107be52a225a0f2e580aeec571f5071f1c2e5f3b5313eaf5c64b3855b2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-alpha-persian-doc-fa \
texlive-alpha-persian-doc"

RDEPENDS:${PN} += ""

inherit rpm
