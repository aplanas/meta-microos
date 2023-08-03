SUMMARY = "Documentation for texlive-xpunctuate"
DESCRIPTION = "This package includes the documentation for texlive-xpunctuate"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn26641"

RPM_NAME = "texlive-xpunctuate-doc-2023.209.1.0svn26641-53.1.noarch.rpm"
RPM_HASH = "e22726eba236e318dc5ed8c416f33ca9dc2a9983105cc5f8fa418102fdb7f2d042fa6a7bfd00fce42e10e7eedcec1e8a8ffef0b42e6a9b81da78c94904c4c767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpunctuate-doc"

RDEPENDS:${PN} += ""

inherit rpm
