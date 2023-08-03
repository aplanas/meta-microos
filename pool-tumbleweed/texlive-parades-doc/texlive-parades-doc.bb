SUMMARY = "Documentation for texlive-parades"
DESCRIPTION = "This package includes the documentation for texlive-parades"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn40042"

RPM_NAME = "texlive-parades-doc-2023.209.svn40042-52.1.noarch.rpm"
RPM_HASH = "3da8b76499e3dd1a2ea2704bd11ad563a2efbda9bf7fea1c4655a9f7fe13fac40e00bde5cda12812792b2da2215593792cf5e03e174dc12455ca68c77e533ac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parades-doc"

RDEPENDS:${PN} += ""

inherit rpm
