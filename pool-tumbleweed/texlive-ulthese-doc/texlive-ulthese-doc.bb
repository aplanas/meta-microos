SUMMARY = "Documentation for texlive-ulthese"
DESCRIPTION = "This package includes the documentation for texlive-ulthese"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.3asvn60217"

RPM_NAME = "texlive-ulthese-doc-2023.209.5.3asvn60217-54.1.noarch.rpm"
RPM_HASH = "774086824c7754076098f381aad7e581c0a13d1dd7293b5af033253acfc5421423fefd1b6b4acd3a6acffd4e7c92ee8aadcffdae30f07d594fdbaf03e7ea3101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ulthese-doc-fr \
texlive-ulthese-doc"

RDEPENDS:${PN} += ""

inherit rpm
