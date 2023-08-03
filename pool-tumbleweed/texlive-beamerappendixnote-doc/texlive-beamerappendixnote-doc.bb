SUMMARY = "Documentation for texlive-beamerappendixnote"
DESCRIPTION = "This package includes the documentation for texlive-beamerappendixnote"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn55732"

RPM_NAME = "texlive-beamerappendixnote-doc-2023.209.1.2.0svn55732-54.1.noarch.rpm"
RPM_HASH = "56cad42da240a20b3b4bd016f69fb73d7f2e45ac18a1175a0b4b76250e7b0733b993e33e0171244a87a87caee5b0f25ae2ab4096ee933f3ff9cfdcf83415014d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerappendixnote-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
