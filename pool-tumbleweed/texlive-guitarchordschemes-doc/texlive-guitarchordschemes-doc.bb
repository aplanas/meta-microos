SUMMARY = "Documentation for texlive-guitarchordschemes"
DESCRIPTION = "This package includes the documentation for texlive-guitarchordschemes"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn54512"

RPM_NAME = "texlive-guitarchordschemes-doc-2023.209.0.0.7svn54512-54.1.noarch.rpm"
RPM_HASH = "c46a65f3b765859fe42757a6c9dfb4ce209fcddda00acd97e94977b995c25cda94aab9d535a6a80c486956de41144926e3e9c8e5c4671c22462919e352bcffbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-guitarchordschemes-doc-en \
texlive-guitarchordschemes-doc"

RDEPENDS:${PN} += ""

inherit rpm
