SUMMARY = "Documentation for texlive-hyperxmp"
DESCRIPTION = "This package includes the documentation for texlive-hyperxmp"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.11svn65980"

RPM_NAME = "texlive-hyperxmp-doc-2023.201.5.11svn65980-52.1.noarch.rpm"
RPM_HASH = "cec5611961184f8f75cc1372bbce6b1b75bb69e3f1a05cfeb02c6f7cc0be639bf745e7b8a2d2afbc0324f6732f91f1fce84b1dff95fc201d99adf453d207f7a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(hyperxmp-add-bytecount.1) \
texlive-hyperxmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
