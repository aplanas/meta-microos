SUMMARY = "Documentation for texlive-context-cyrillicnumbers"
DESCRIPTION = "This package includes the documentation for texlive-context-cyrillicnumbers"
LICENSE = "BSD-3-Clause"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-cyrillicnumbers-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "af7bc371257fc876e1d58985b7b68482867cbc34c1f45212610f364b95bc08f720533aab760cdc90c48027989e793aa884495228bfec4c22de3d45d779bb751f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-cyrillicnumbers-doc"

RDEPENDS:${PN} += ""

inherit rpm
