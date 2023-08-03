SUMMARY = "Documentation for texlive-gu"
DESCRIPTION = "This package includes the documentation for texlive-gu"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-gu-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "d97d4da39f9d163310c11b9d8e13a5736f8a56dc82cbf37fab9f17502ef50ee389566404ed6d264f07104dcd86b87f20b98a9ed78d75d8777c7423b3cc70c7b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gu-doc-de \
texlive-gu-doc"

RDEPENDS:${PN} += ""

inherit rpm
