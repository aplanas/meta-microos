SUMMARY = "Documentation for texlive-context-lettrine"
DESCRIPTION = "This package includes the documentation for texlive-context-lettrine"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-lettrine-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "3b025942524929523450b540822f3d5f4ce2cbb0c2c8a1e88f885fb10c5a911d013cd36b961fb8ad02c706499dc7e2016f56a08369918cf44cfda1e078055724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-lettrine-doc"

RDEPENDS:${PN} += ""

inherit rpm
