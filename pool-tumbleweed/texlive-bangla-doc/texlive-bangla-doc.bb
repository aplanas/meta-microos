SUMMARY = "Documentation for texlive-bangla"
DESCRIPTION = "This package includes the documentation for texlive-bangla"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn65786"

RPM_NAME = "texlive-bangla-doc-2023.201.2.1svn65786-53.1.noarch.rpm"
RPM_HASH = "d90c097c6c2154ffabb01bb03e8085c7901e631edfdfd036826a012c8a07a0c017a1b111fab2f0f012504abba6d5a248f75b8e647654b1d5e15075924a79f79d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bangla-doc"

RDEPENDS:${PN} += ""

inherit rpm
