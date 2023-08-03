SUMMARY = "Documentation for texlive-gost"
DESCRIPTION = "This package includes the documentation for texlive-gost"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2lsvn57616"

RPM_NAME = "texlive-gost-doc-2023.209.1.2lsvn57616-54.1.noarch.rpm"
RPM_HASH = "393bcc057c6294f810cd6cfff76a0860fef7580dde15a680080f484807fe699a4f1478dc1157ff9d5da6690aa8b1dd712766d1a26350ec41efa9c089ddd79294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gost-doc-en \
texlive-gost-doc"

RDEPENDS:${PN} += ""

inherit rpm
