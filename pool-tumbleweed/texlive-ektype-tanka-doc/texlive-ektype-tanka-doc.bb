SUMMARY = "Documentation for texlive-ektype-tanka"
DESCRIPTION = "This package includes the documentation for texlive-ektype-tanka"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn63255"

RPM_NAME = "texlive-ektype-tanka-doc-2023.209.0.0.2svn63255-54.2.noarch.rpm"
RPM_HASH = "edda59fb3ce96d248bb7ee676c5bc51ef5d247be8a2cbea6397efe6c458284f0c951a282da34d52d7dee2a134ae6ecb9220f0323d040918f777d325777487650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hi) \
locale(texlive-ektype-tanka-doc-mr \
texlive-ektype-tanka-doc"

RDEPENDS:${PN} += ""

inherit rpm
