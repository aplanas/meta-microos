SUMMARY = "Documentation for texlive-quiz2socrative"
DESCRIPTION = "This package includes the documentation for texlive-quiz2socrative"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn52276"

RPM_NAME = "texlive-quiz2socrative-doc-2023.209.1.0svn52276-54.2.noarch.rpm"
RPM_HASH = "83a17fa8e03f142eec65cd45ad825d03ed7ff1f585370550b72825a87677260497c69f2aca16f1aa7e5b4316c76319b3ab6fc49cb6527686e8611d2d6d231321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-quiz2socrative-doc-it \
texlive-quiz2socrative-doc"

RDEPENDS:${PN} += ""

inherit rpm
