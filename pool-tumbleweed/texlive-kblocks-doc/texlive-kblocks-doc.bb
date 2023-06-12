SUMMARY = "Documentation for texlive-kblocks"
DESCRIPTION = "This package includes the documentation for texlive-kblocks"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn57617"

RPM_NAME = "texlive-kblocks-doc-2023.201.2.0svn57617-55.1.noarch.rpm"
RPM_HASH = "039c588985ee661482c793741d001914867ccc09a42d0490d045cca338e5e4a7222b8cd9a4939a85733e60090125465d1a9c5675e3620ff75799df70d7f5c16b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kblocks-doc"
RDEPENDS:${PN} += ""

inherit rpm
