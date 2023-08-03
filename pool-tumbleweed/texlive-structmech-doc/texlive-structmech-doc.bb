SUMMARY = "Documentation for texlive-structmech"
DESCRIPTION = "This package includes the documentation for texlive-structmech"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn58985"

RPM_NAME = "texlive-structmech-doc-2023.209.1.1svn58985-58.1.noarch.rpm"
RPM_HASH = "0a6a3f5ac07f55aecf14dd40e87b330a805967c02cb5c4a69189f0abfa598f231b566ef050e50249696c9359e6a4b09ebb97c4664be6c1a14cd212f631eb222c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-structmech-doc"

RDEPENDS:${PN} += ""

inherit rpm
