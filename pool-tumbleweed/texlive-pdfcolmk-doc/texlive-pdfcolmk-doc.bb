SUMMARY = "Documentation for texlive-pdfcolmk"
DESCRIPTION = "This package includes the documentation for texlive-pdfcolmk"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn52912"

RPM_NAME = "texlive-pdfcolmk-doc-2023.209.2.0svn52912-52.1.noarch.rpm"
RPM_HASH = "0bd20e8953f77f06422ad4433c4ed2537e4213d7b76c5fa69ea30eb569e78a85ff5f6c0496c98acb2d81e9b083ff6f06d2a6a6cce52ce08e2cf2c72d0d5667fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcolmk-doc"

RDEPENDS:${PN} += ""

inherit rpm
