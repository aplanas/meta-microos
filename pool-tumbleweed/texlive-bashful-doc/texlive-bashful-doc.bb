SUMMARY = "Documentation for texlive-bashful"
DESCRIPTION = "This package includes the documentation for texlive-bashful"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.93svn25597"

RPM_NAME = "texlive-bashful-doc-2023.209.0.0.93svn25597-54.1.noarch.rpm"
RPM_HASH = "5c679db677e3cc73ceb9e3b5a05ee9ea588e327e1c1029e82e30b14c1a303161202d9db319a376d6ff187bc85f5165ec97e04c25141e94aa06ee658e8b455425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bashful-doc"

RDEPENDS:${PN} += ""

inherit rpm
