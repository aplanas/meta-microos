SUMMARY = "Documentation for texlive-edfnotes"
DESCRIPTION = "This package includes the documentation for texlive-edfnotes"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6bsvn21540"

RPM_NAME = "texlive-edfnotes-doc-2023.209.0.0.6bsvn21540-54.2.noarch.rpm"
RPM_HASH = "ba7e0d01d50264ef5f6f7f8150b9da0539d1b4f695d346554f2ad7c3d6edcf1070253ae1db4c6e14ca709661c8d2a718c8c5fa4457348481e8f349676dd1629c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edfnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
