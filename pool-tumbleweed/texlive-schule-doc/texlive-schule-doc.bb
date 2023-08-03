SUMMARY = "Documentation for texlive-schule"
DESCRIPTION = "This package includes the documentation for texlive-schule"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.3svn60210"

RPM_NAME = "texlive-schule-doc-2023.209.0.0.8.3svn60210-54.1.noarch.rpm"
RPM_HASH = "29f8c7c0cae5faaededc8c7ed6a804264732de0fed3a9f3a52a71d39b05e89daa81e8bafe00fffe3e25442fc18818afd697cf5736b9dd46d3beec5f5f48bb0f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-schule-doc-de \
texlive-schule-doc"

RDEPENDS:${PN} += ""

inherit rpm
