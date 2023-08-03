SUMMARY = "Documentation for texlive-uml"
DESCRIPTION = "This package includes the documentation for texlive-uml"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn17476"

RPM_NAME = "texlive-uml-doc-2023.209.0.0.11svn17476-54.1.noarch.rpm"
RPM_HASH = "3d367dcefa78c51cd338580a86492ce9933367852381c445a103723a212d39f1ad92775e34967d5a89aed88df6abeb77ec463b8a3fe75b7570c8ea6a0a1d24e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uml-doc"

RDEPENDS:${PN} += ""

inherit rpm
