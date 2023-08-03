SUMMARY = "Documentation for texlive-arara"
DESCRIPTION = "This package includes the documentation for texlive-arara"
LICENSE = "BSD-3-Clause"

PV = "2023.209.7.0.4svn63760"

RPM_NAME = "texlive-arara-doc-2023.209.7.0.4svn63760-55.1.noarch.rpm"
RPM_HASH = "f2654478277775376ac30735940f671b444a96ca437551c1c49dc790502572f2cde6363c7fe6c378c958b11fc942a416742a0863de92d42803728439e8c561c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-arara.1 \
texlive-arara-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
