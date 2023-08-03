SUMMARY = "Documentation for texlive-lettrine"
DESCRIPTION = "This package includes the documentation for texlive-lettrine"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.30svn64511"

RPM_NAME = "texlive-lettrine-doc-2023.209.2.30svn64511-55.1.noarch.rpm"
RPM_HASH = "961978d11bf4d847e174f6adf0213b6093f7e679d68f3555a5b5f3be76f09f662ba3add5c9f7ec51d32032f2ffaf2068c2c418f1f13a5a34f1a9db55605029fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-lettrine-doc-de;fr \
texlive-lettrine-doc"

RDEPENDS:${PN} += ""

inherit rpm
