SUMMARY = "Documentation for texlive-endnotesj"
DESCRIPTION = "This package includes the documentation for texlive-endnotesj"
LICENSE = "BSD-3-Clause"

PV = "2023.209.3.0svn47703"

RPM_NAME = "texlive-endnotesj-doc-2023.209.3.0svn47703-54.1.noarch.rpm"
RPM_HASH = "38e067aea26e6c2a46a7c8c23e3359e7637a8e00fb44533b96fd62f2c08496b25d8d3f3835989e5057fcfbcf2060129f65c929414356b4b67b637f99f714b27c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-endnotesj-doc-ja \
texlive-endnotesj-doc"

RDEPENDS:${PN} += ""

inherit rpm
