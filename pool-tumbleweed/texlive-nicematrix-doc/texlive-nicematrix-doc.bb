SUMMARY = "Documentation for texlive-nicematrix"
DESCRIPTION = "This package includes the documentation for texlive-nicematrix"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.16svn66461"

RPM_NAME = "texlive-nicematrix-doc-2023.209.6.16svn66461-55.1.noarch.rpm"
RPM_HASH = "68266ca0807dc34d7e72050e4de2b75bfb07bda3fd8fe604ce5d0689de33106fbb3e334b492049fae03ab90f919074e305fd61e80494c9d9196672e311870318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nicematrix-doc-fr \
texlive-nicematrix-doc"

RDEPENDS:${PN} += ""

inherit rpm
