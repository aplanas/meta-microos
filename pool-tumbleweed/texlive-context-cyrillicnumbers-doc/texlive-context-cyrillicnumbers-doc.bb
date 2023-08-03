SUMMARY = "Documentation for texlive-context-cyrillicnumbers"
DESCRIPTION = "This package includes the documentation for texlive-context-cyrillicnumbers"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-cyrillicnumbers-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "b209d803c944357397eb97c30dba5bcfeff74fb14ed06b86fd35ad4ef8fc41564a893124c257dce17342a3ddd614021f2659ff72e332f8361ebe44522e5ea7e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-cyrillicnumbers-doc"

RDEPENDS:${PN} += ""

inherit rpm
