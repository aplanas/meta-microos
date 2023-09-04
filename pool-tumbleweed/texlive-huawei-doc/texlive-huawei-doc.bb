SUMMARY = "Documentation for texlive-huawei"
DESCRIPTION = "This package includes the documentation for texlive-huawei"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.15.0svn65264"

RPM_NAME = "texlive-huawei-doc-2023.209.0.0.15.0svn65264-54.1.noarch.rpm"
RPM_HASH = "87dc46acbffb28d822f3bf75c7528fbb0831eca3535d75b575105e8c8508519195e9fe8831fe09cbf2d6c8443ea2581b08c542c4f2b25d36b00e4f77779b17dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-huawei-doc"

RDEPENDS:${PN} += ""

inherit rpm
