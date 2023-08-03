SUMMARY = "Documentation for texlive-dhua"
DESCRIPTION = "This package includes the documentation for texlive-dhua"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn24035"

RPM_NAME = "texlive-dhua-doc-2023.209.0.0.11svn24035-53.1.noarch.rpm"
RPM_HASH = "a50e99c6522aaaf6425d4c3b977e9c640c2fc6d8280f64447f0b890daf23a6266ee26d4e379c7e8714db8e1da536fc81dc3da27838f8406a0555dfaa50e77d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dhua-doc"

RDEPENDS:${PN} += ""

inherit rpm
