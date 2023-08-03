SUMMARY = "Documentation for texlive-rbt-mathnotes"
DESCRIPTION = "This package includes the documentation for texlive-rbt-mathnotes"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn61193"

RPM_NAME = "texlive-rbt-mathnotes-doc-2023.209.1.0.2svn61193-54.1.noarch.rpm"
RPM_HASH = "9492459f019f425e824096c99282912ac8946c878afb3f242248743d0cf6e05bddf60330cf480ba0d5149d9c29e49576cb88a5b8bb5d062f5d691d641fb96804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rbt-mathnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
