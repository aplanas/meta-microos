SUMMARY = "Documentation for texlive-context-annotation"
DESCRIPTION = "This package includes the documentation for texlive-context-annotation"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-annotation-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "fc4749acdc4812504d354cb41b0935516869b67c6d2766713f0aaf80182ed35ab344d4c952c467bcc17eea8b89e076a2dfdbf363146517a6cafd21180834efbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-annotation-doc"

RDEPENDS:${PN} += ""

inherit rpm
